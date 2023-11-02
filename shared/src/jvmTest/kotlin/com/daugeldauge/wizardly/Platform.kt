package com.daugeldauge.wizardly

import kotlin.test.Test


class AndroidPlatform : Platform {
    override val name: String = "Android ${System.getProperty("java.version")}"
}

@Test
actual fun getPlatform(): Platform = AndroidPlatform()