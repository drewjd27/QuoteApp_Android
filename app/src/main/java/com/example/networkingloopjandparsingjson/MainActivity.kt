package com.example.networkingloopjandparsingjson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.networkingloopjandparsingjson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getRandomQuote()
    }

    private getRandomQuote() {

    }

}