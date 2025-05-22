package com.example.testdiffviewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyFragment: Fragment() {

    lateinit var binder: Binder

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binder = fragment(container)

        // if kids
        (binder as? Binder.Kids)?.binding?.testId?.text = "WTF KIDS!" // reference id

        // if normal
        (binder as? Binder.Normal)?.binding?.testId2?.text = "WTF ADULTS!" // reference id


        return binder.binding.root
    }
}