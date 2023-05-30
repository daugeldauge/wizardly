package com.daugeldauge.wizardly

import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"

    init {
        SharedPreferencesSettings()
    }
}

actual fun getPlatform(): Platform = AndroidPlatform()