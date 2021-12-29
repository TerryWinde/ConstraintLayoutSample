package com.terrywinde.constraintlayout

import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

/**
 * Created by Terry on 2021/8/26
 */
class ConstraintSetActivity : AppCompatActivity() {
    private var isHor: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.layout_constraint_view)
        setContentView(R.layout.layout_constraint_vertical)
    }

//    fun onClick(view: View) {
//        val constraintLayout = view as ConstraintLayout
//        val constraintSet = ConstraintSet().apply {
//            clone(constraintLayout)
//            connect(
//                R.id.textView,
//                ConstraintSet.BOTTOM,
//                ConstraintSet.PARENT_ID,
//                ConstraintSet.BOTTOM
//            )
//        }
//        constraintSet.applyTo(constraintLayout)
//    }

    fun onClick(view: View) {
        //关键帧动画
        val constraintLayout = view as ConstraintLayout
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, if (isHor) R.layout.layout_constraint_vertical else R.layout.layout_constraint_hor)
        TransitionManager.beginDelayedTransition(constraintLayout)
        constraintSet.applyTo(constraintLayout)
        isHor = !isHor
    }
}