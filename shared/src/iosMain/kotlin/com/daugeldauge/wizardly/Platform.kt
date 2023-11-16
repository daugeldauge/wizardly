package com.daugeldauge.wizardly

//import cocoapods.Base64.MF_Base64Codec
import platform.UIKit.UIDevice

@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
class IOSPlatform : Platform {
    override val name: String =
        """
            ${UIDevice.currentDevice.systemName()}
            ${UIDevice.currentDevice.systemVersion}
            $\{MF_Base64Codec.base64StringFromData(MF_Base64Codec.dataFromBase64String("R3JlZXRpbmdzCg=="))}
       """.trimIndent()
}

actual fun getPlatform(): Platform = IOSPlatform()