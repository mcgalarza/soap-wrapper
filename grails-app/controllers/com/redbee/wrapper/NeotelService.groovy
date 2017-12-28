package com.redbee.wrapper

import grails.transaction.Transactional

@Transactional
class NeotelService {

    def serviceMethod() {
        log.info('service')
    }
}
