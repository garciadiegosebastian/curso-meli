package gorm.oddities

class OdditiesTagLib {
    static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [databaseStatus: [taglib:'none']]

    static namespace = "meli"

    /**
     * Mostrar el conteido de todas las tablas
     */
    def databaseStatus = { attrs, body ->
    	def model = [
	    	usuarios: Usuario.list(),
	    	direcciones: Direccion.list(),
	    	telefonos: Telefono.list(),
		]

    	out << render(template: "/templates/databaseStatus", model: model)
    }
}
