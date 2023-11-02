package com.daugeldauge.wizardly

class JsPlatform : Platform {
    override val name: String = "WasmWasi" + mapOf("" to "").toList().joinToString()

}

actual fun getPlatform(): Platform = JsPlatform()