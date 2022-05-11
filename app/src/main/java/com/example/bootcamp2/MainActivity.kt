package com.example.bootcamp2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.bootcamp2.databinding.ActivityMainBinding
import com.example.bootcamp2.ui.login.LoginActivity
import java.lang.NullPointerException

class MainActivity : Activity() {

    private val BOOTCAMP = "bootcamp_globant_ceiba"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(BOOTCAMP, "onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.i(BOOTCAMP, "onStart")

        binding.buttonLifecycleB.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.buttonScrolling.setOnClickListener {
            val intent = Intent(this, ScrollingActivity::class.java)
            startActivity(intent)
        }
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