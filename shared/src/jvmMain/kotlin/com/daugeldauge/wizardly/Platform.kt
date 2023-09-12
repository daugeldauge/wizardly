package com.daugeldauge.wizardly

import kotlinx.coroutines.Dispatchers

class AndroidPlatform : Platform {
    init {
        mutableMapOf("t" to "zz")

        Dispatchers.IO
    }

    override val name: String = "JVM ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
