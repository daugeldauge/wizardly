@file:OptIn(ExperimentalObjCName::class)

package com.daugeldauge.wizardly

import kotlin.experimental.ExperimentalObjCName
import kotlin.test.Test

@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
class MacosPlatform : Platform {
    override val name: String = "macos!!"
}

actual fun getPlatform(): Platform = MacosPlatform()