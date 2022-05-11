package com.example.bootcamp2

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.bootcamp2.databinding.ActivityBBinding
import com.example.bootcamp2.databinding.ActivityMainBinding

class MainActivityB : Activity() {

    private val BOOTCAMP = "bootcamp_globant_ceiba"

    private lateinit var binding: ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(BOOTCAMP, "onCreate B")
    }

    override fun onStart() {
        super.onStart()

        Log.i(BOOTCAMP, "onStart B")
    }

    override fun onResume() {
        super.onResume()

        Log.i(BOOTCAMP, "onResume B")
    }

    override fun onPause() {
        super.onPause()

        Log.i(BOOTCAMP, "onPause B")
    }

    override fun onStop() {
        super.onStop()

        Log.i(BOOTCAMP, "onStop B")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(BOOTCAMP, "onDestroy B")
    }
}