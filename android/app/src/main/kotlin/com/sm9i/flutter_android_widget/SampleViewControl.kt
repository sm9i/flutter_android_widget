package com.sm9i.flutter_android_widget

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.View
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.platform.PlatformView
import android.widget.TextView


class SampleViewControl(context: Context, id: Int, messenger: BinaryMessenger) : PlatformView {
    private val view: View

    init {
        val view = TextView(context)
        view.text = "android View"
        view.setBackgroundColor(Color.rgb(255, 0, 0))
        view.gravity = Gravity.CENTER
        this.view = view

    }


    override fun getView(): View? {
        return view
    }

    override fun dispose() {

    }
}
