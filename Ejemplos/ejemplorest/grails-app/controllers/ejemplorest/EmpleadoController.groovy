package ejemplorest
import grails.rest.RestfulController

class EmpleadoController extends RestfulController {
    EmpleadoController() {
        super(Empleado)
    }

    /**
     * Aceptamos el parametro Q (por query string) que sera el criterio de búsqueda
     */
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)

        def empleados =  Empleado.findAllByNameLike(params.q?:"" + "%");
        respond empleados
    }
}