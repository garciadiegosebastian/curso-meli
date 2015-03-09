class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/empleado"(resources:"empleado")

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
