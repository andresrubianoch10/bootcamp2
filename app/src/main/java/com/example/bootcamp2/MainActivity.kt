package com.example.bootcamp2

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val BOOTCAMP = "bootcamp_globant_ceiba"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val colorPurple = R.color.purple_200
        val welcome = getString(R.string.bienvenidos)
        val x = 15
        if (x < 10) {
            findViewById<TextView>(R.id.textView_feed_title).text = getString(R.string.bienvenidos)
        } else {
            findViewById<TextView>(R.id.textView_feed_title).text = getString(R.string.error)
        }

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