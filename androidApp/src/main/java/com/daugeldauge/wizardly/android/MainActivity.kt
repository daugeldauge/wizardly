package com.daugeldauge.wizardly.android

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup.LayoutParams
import android.widget.TextView
import com.daugeldauge.wizardly.Greeting

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
            textSize = 24f
            gravity = Gravity.CENTER
            text = Greeting().greet()
        })
    }
}