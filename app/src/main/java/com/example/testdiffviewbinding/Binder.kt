package com.example.testdiffviewbinding

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.testdiffviewbinding.databinding.ActivityTest2Binding
import com.example.testdiffviewbinding.databinding.ActivityTestBinding

sealed class Binder(open val binding: ViewBinding) {
    class Kids(override val binding: ActivityTestBinding) : Binder(binding)
    class Normal(override val binding: ActivityTest2Binding) : Binder(binding)
}

fun Fragment.fragment(
    container: ViewGroup?
): Binder {
    return if (true) {
        Binder.Kids(ActivityTestBinding.inflate(layoutInflater, container, false))
    } else {
        Binder.Normal(ActivityTest2Binding.inflate(layoutInflater, container, false))
    }
}

fun Activity.bind(): Binder{
    return if (true) {
        Binder.Kids(ActivityTestBinding.inflate(layoutInflater))
    } else {
        Binder.Normal(ActivityTest2Binding.inflate(layoutInflater))
    }
}