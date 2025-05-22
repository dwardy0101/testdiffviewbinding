package com.example.testdiffviewbinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

typealias Edward = Set<String>

class MainActivity : AppCompatActivity() {

    lateinit var binder: Binder

    val set: Edward = setOf("dadad", "dasdsd")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binder = bind()

        (binder as? Binder.Kids)?.binding?.testId?.text = "WTF KIDS!"

        (binder as? Binder.Normal)?.binding?.testId2?.text = "WTF ADULTS!"

        setContentView(binder.binding.root)
    }
}