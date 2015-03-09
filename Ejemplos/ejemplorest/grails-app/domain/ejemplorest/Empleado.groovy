package ejemplorest
import grails.rest.Resource

@Resource(uri="/empleado")
class Empleado {
	long id
	String name
	String lastname
	Date birthday
}
