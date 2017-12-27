class UrlMappings {

    static mappings = {
//        "/$controller/$action?/$id?(.$format)?"{
//
//        }


        group "/api", {
        "/neotel"(controller: 'neotel', method: 'POST', action: 'callNeotel')

        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}