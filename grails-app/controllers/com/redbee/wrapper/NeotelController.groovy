package com.redbee.wrapper

import grails.converters.JSON

class NeotelController {

    static allowedMethods = [callNeotel:'GET']

    def callNeotel() {

        render ([content: "call neotel"] as JSON)
    }
}
