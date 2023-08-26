package com.daugeldauge.wizardly

import co.touchlab.kermit.mutableLoggerConfigInit
import cocoapods.Base64.MF_Base64Codec
import platform.UIKit.UIDevice

class IOSPlatform : Platform {
    init {
        mutableLoggerConfigInit(emptyList())
    }

    override val name: String =
        """
            ${UIDevice.currentDevice.systemName()}
            ${UIDevice.currentDevice.systemVersion}
            ${MF_Base64Codec.base64StringFromData(MF_Base64Codec.dataFromBase64String("R3JlZXRpbmdzCg=="))}
       """.trimIndent()

}

actual fun getPlatform(): Platform = IOSPlatform()