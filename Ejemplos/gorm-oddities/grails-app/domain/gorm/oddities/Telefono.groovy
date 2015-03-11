package gorm.oddities

class Telefono {
	String numero
	static belongsTo=[usuario: Usuario]
    static constraints = {
    }
}
