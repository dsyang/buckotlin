package com.dsyang.logger

class DefaultLogger : Logger {

    override fun log(s: String): Int {
        println(s)
        return 0
    }
}