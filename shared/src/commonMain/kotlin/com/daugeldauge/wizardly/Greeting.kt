package com.daugeldauge.wizardly

import kotlin.time.measureTime

class Greeting {
    private val platform: Platform = getPlatform()

    init {
//        mutableLoggerConfigInit(emptyList())
    }

    fun greet(): String {
        return sequenceOf("1", "2", "3").joinToString(separator = ";") + "hekk" + mutableMapOf("" to "")
//        return "Hello, ${platform.name}!"
    }
}