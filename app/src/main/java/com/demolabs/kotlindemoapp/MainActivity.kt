package com.demolabs.kotlindemoapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initControls()
    }

    private fun initControls() {
        val btnSubmit = findViewById<Button>(R.id.submit)
        btnSubmit.setOnClickListener {
            longToast("Hello, World")
        }
    }
}
