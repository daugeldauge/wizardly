package com.daugeldauge.wizardly

//import cocoapods.CouchbaseLite.CBLErrorBusy
import platform.UIKit.UIDevice

class IOSPlatform : Platform {
    override val name: String =
        """
            ${UIDevice.currentDevice.systemName()}
            ${UIDevice.currentDevice.systemVersion}
            ${""/*MF_Base64Codec.base64StringFromData(MF_Base64Codec.dataFromBase64String("R3JlZXRpbmdzCg=="))*/}
       """.trimIndent()
}

actual fun getPlatform(): Platform = IOSPlatform()