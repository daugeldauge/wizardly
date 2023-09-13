package com.daugeldauge.wizardly

import platform.UIKit.UIDevice

@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
class IOSPlatform : Platform {
    override val name: String =
        """
            ${UIDevice.currentDevice.systemName()}
            ${UIDevice.currentDevice.systemVersion}
       """.trimIndent()
}

actual fun getPlatform(): Platform = IOSPlatform()