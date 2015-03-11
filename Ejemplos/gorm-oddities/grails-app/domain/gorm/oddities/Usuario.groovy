package gorm.oddities

class Usuario {
	String nombre
	static hasMany = [telefonos: Telefono, direcciones: Direccion]
    static constraints = {
    }
}
