package com.daugeldauge.wizardly

import co.touchlab.kermit.mutableLoggerConfigInit

class Greeting {
    private val platform: Platform = getPlatform()

    init {
        mutableLoggerConfigInit(emptyList())
    }

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}