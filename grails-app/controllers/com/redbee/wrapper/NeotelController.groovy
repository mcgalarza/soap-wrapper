package com.redbee.wrapper

import grails.converters.JSON

class NeotelController {

    static allowedMethods = [callNeotel:'POST']

    def neotelService

    def callNeotel() {

        return r(neotelService.serviceMethod())

//        render ([content: "call neotel"] as JSON)
    }
}
