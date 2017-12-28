class UrlMappings {

    static mappings = {


        group "/api", {
            "/neotel"(controller: 'neotel', action: 'callNeotel' , method: 'PUT')

        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}