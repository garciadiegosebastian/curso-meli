package gorm.oddities

class Direccion {
	String calle
	static belongsTo = Usuario
    static constraints = {
    }
}
