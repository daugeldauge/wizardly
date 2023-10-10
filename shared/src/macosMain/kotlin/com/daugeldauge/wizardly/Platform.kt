package com.daugeldauge.wizardly

@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
class MacosPlatform : Platform {
    override val name: String = "macos!!"
}

actual fun getPlatform(): Platform = MacosPlatform()