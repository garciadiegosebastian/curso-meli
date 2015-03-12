package gorm.oddities

class BelongsToController {
    def databaseService

    def index() {
        databaseService.empty()
    }

    def initialize() {
        databaseService.createTestFixture()
    }

    def delete() {
    	def usuarios = Usuario.list()
    	usuarios.each { it.delete(flush: true, failOnError: true) }
    }
}
