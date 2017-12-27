package com.redbee.wrapper

import grails.converters.JSON

class NeotelController {

    static allowedMethods = [callNeotel:'GET']

    def callNeotel() {

        render ('call neotel' as JSON)
    }
}
