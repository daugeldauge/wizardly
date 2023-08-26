package com.daugeldauge.wizardly

import co.touchlab.kermit.mutableLoggerConfigInit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

class Greeting {

    init {
        mutableLoggerConfigInit(emptyList())

        Dispatchers.IO

        mutableMapOf("to" to "to")
    }

    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}