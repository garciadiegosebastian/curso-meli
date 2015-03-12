package gorm.oddities

class TransactionsController {

    def index() {
    	Usuario.list().each { it.delete(flush: true, failOnError: true) }

    	def usuario = new Usuario(nombre: "Fernando")
    	
    	def telefono1 = new Telefono(numero: "47779933")
    	def telefono2 = new Telefono(numero: "99844224")
    	usuario.addToTelefonos(telefono1)
    	usuario.addToTelefonos(telefono2)

    	def direccion1 = new Direccion(calle: "Arias 3777")
    	def direccion2 = new Direccion(calle: "Cabildo 3944")
    	usuario.addToDirecciones(direccion1)
    	usuario.addToDirecciones(direccion2)

    	usuario.save(failOnError: true, flush: true)
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
