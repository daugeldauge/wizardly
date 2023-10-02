package com.daugeldauge.wizardly

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform