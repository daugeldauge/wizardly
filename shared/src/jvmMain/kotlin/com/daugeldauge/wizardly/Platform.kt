package com.daugeldauge.wizardly

class AndroidPlatform : Platform {
    override val name: String = "JVM ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
