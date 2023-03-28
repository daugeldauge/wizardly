package com.daugeldauge.wizardly

import cocoapods.Base64.MF_Base64Codec
import cocoapods.pod1.Pod1
import cocoapods.pod2.Pod2
import platform.UIKit.UIDevice

class IOSPlatform : Platform {
    override val name: String =
        """
            ${UIDevice.currentDevice.systemName()}
            ${UIDevice.currentDevice.systemVersion}
            ${MF_Base64Codec.base64StringFromData(MF_Base64Codec.dataFromBase64String("R3JlZXRpbmdzCg=="))}
       """.trimIndent()
}

actual fun getPlatform(): Platform = IOSPlatform()

fun printPod1(p: Pod1) {
    println(p.pod1())
}

fun printPod2(p: Pod2) {
    println("Hi from Kt!")
    println(p.pod2())
    printPod1(p)
}