package com.redbee.wrapper

class NeotelController {

    static allowedMethods = [callNeotel: 'POST']

    def callNeotel() {
        render 'call neotel'
    }
}
