package com.daugeldauge.wizardly

import com.daugeldauge.wizardly2.Greeting2

class Greeting {
    private val greeting2 = Greeting2()
    private val greeting3 = Greeting3()

    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}