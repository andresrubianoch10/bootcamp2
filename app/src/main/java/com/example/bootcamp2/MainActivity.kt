package com.example.bootcamp2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val BOOTCAMP = "bootcamp_globant_ceiba"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(BOOTCAMP, "onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.i(BOOTCAMP, "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i(BOOTCAMP, "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.i(BOOTCAMP, "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.i(BOOTCAMP, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(BOOTCAMP, "onDestroy")
    }
}