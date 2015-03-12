package gorm.oddities

import grails.transaction.Transactional

@Transactional
class DatabaseService {

    def empty() {
    	Usuario.list().each { it.delete() } 
	}

	def createTestFixture() {
    	def usuario = new Usuario(nombre: "Fernando")
    	
    	def telefono1 = new Telefono(numero: "47779933")
    	def telefono2 = new Telefono(numero: "99844224")
    	usuario.addToTelefonos(telefono1)
    	usuario.addToTelefonos(telefono2)

    	def direccion1 = new Direccion(calle: "Arias 3777")
    	def direccion2 = new Direccion(calle: "Cabildo 3944")
    	usuario.addToDirecciones(direccion1)
    	usuario.addToDirecciones(direccion2)

    	usuario.save()
	}

}
