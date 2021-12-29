package com.terrywinde.constraintlayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Layer
import androidx.constraintlayout.widget.Group

/**
 * Created by Terry on 2021/8/26
 */
class HelperActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.layout_group)
//        setContentView(R.layout.layout_text)
        setContentView(R.layout.layout_layer)
//        setContentView(R.layout.layout_flow)
    }

    fun onClick(view: View) {
        this.findViewById<Layer>(R.id.layer).rotation = 90f
        findViewById<Layer>(R.id.layer).translationY = 500f
    }

    fun onGroupClick(view: View) {
        findViewById<Group>(R.id.group).visibility = View.GONE
    }
}