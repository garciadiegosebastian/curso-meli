package gorm.oddities

class BelongsToController {

    def index() { }

    def initialize() {
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

    	[
	    	usuarios: Usuario.list(),
	    	direcciones: Direccion.list(),
	    	telefonos: Telefono.list(),
    	]
    }

    def delete() {
    	def usuarios = Usuario.list()
    	usuarios.each { it.delete(flush: true, failOnError: true) }

    	[
	    	usuarios: Usuario.list(),
	    	direcciones: Direccion.list(),
	    	telefonos: Telefono.list(),
    	]
    }
}
