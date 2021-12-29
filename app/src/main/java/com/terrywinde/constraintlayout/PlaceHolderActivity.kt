package com.terrywinde.constraintlayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Placeholder

/**
 * Created by Terry on 2021/8/26
 */
class PlaceHolderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_placeholder)
    }

    fun onClick(view: View) {
        findViewById<Placeholder>(R.id.placeholder).setContentId(view.id)
    }
}