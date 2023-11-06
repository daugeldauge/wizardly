package com.daugeldauge.wizardly

import kotlin.concurrent.Volatile
import kotlin.experimental.ExperimentalObjCName

class AndroidPlatform : Platform {
    init {
        mapOf("" to "")
        AbstractMutableCollection().map
        1 + 1

        listOf("fff").mapNotNull {  }
    }

    @ExperimentalObjCName
    override val name: String = "Android ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = AndroidPlatform()