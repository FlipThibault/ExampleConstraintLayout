package com.flip.exampleconstraintlayout

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.p_constraints_programatically.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p_constraints_programatically)

        setupConstraints()
    }

    fun setupConstraints() {

        val constraintSet:ConstraintSet = ConstraintSet()

        constraintSet.clone(root)

        constraintSet.connect(text_view_1.id, ConstraintSet.TOP, root.id, ConstraintSet.TOP, 10)
        constraintSet.connect(text_view_1.id, ConstraintSet.LEFT, root.id, ConstraintSet.LEFT)

        constraintSet.connect(text_view_2.id, ConstraintSet.TOP, text_view_1.id, ConstraintSet.BOTTOM, 10)
        constraintSet.connect(text_view_2.id, ConstraintSet.LEFT, root.id, ConstraintSet.LEFT)

        constraintSet.applyTo(root)

    }
}
