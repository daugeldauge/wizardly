package com.daugeldauge.wizardly

import cocoapods.Base64.MF_Base64Codec
import cocoapods.pod1.Pod1
import cocoapods.pod2.Pod2
import cocoapods.pod3.Pod3
import cocoapods.pod4.Pod42
import cocoapods.pod4.Pod43
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

fun printPod3(p: Pod3) {
    printPod1(p)
}

fun printPods4(p42: Pod42, p43: Pod43) {
    printPod2(p42)
    printPod3(p43)
    printPod1(p42)
    printPod1(p43)
}

fun main() {
    printPods4(Pod42(), Pod43())
}