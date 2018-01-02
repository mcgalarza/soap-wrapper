package com.redbee.wrapper

import grails.converters.JSON

class NeotelController {

    static allowedMethods = [callNeotel:'POST']

    NeotelService neotelService

    def callNeotel() {

        def body = request.JSON

        render(neotelService.serviceMethod(body) as JSON)
    }
}
