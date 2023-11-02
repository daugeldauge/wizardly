package com.daugeldauge.wizardly

class JsPlatform : Platform {
    override val name: String = "WasmJs"
}

actual fun getPlatform(): Platform = JsPlatform()