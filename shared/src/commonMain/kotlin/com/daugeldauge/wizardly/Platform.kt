package com.daugeldauge.wizardly

interface Platform {
    val name: String

    init {
        kotlin.io.println()
    }

}

abstract class X : AbstractMutableMap<String, String>()

expect fun getPlatform(): Platform

expect annotation class Ann(
val x: Int, val y: String,
val z: Double, val b: Boolean
)

expect annotation class Test2()