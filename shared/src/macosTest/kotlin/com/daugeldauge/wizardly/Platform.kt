package com.daugeldauge.wizardly

import kotlin.test.Asserter
import kotlin.test.Test


@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
class MacosPlatform : Platform {
    init {
        Asserter
    }

    override val name: String = "macos!!"
}

@Test
actual fun getPlatform(): Platform = MacosPlatform()