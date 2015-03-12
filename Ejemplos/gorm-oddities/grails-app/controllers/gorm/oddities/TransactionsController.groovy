package gorm.oddities

class TransactionsController {
	def databaseService

    def index() {
    	databaseService.empty()
    	databaseService.createTestFixture()
	}

	def editWithoutSave() {
		Usuario.withTransaction { status ->
			def usuario = Usuario.findByNombre("Fernando")
			usuario.nombre = "Fernando Ariel"
			usuario.telefonos[1].numero = "666-6666"
		}

		render view: "result"
	}

	def noTransactions() {
		def usuario = Usuario.findByNombre("Fernando")
		usuario.nombre = "Fernando Ariel"
		usuario.telefonos[1].numero = "666-6666"
		usuario.save()

		render view: "result"
	}

	def checkedException() {
		try {
			Usuario.withTransaction {
				def usuario = Usuario.findByNombre("Fernando")
				usuario.nombre = "Fernando Ariel"
				usuario.telefonos[1].numero = "666-6666"

				throw new Exception("Sucedió un error")
			}
		}
		catch(Exception e) {}

		render view: "result"
	}

	def runtimeException() {
		try {
			Usuario.withTransaction {
				def usuario = Usuario.findByNombre("Fernando")
				usuario.nombre = "Fernando Ariel"
				usuario.telefonos[1].numero = "666-6666"

				throw new RuntimeException("Sucedió un error")
			}
		}
		catch(Exception e) {}
		
		render view: "result"
	}
}
