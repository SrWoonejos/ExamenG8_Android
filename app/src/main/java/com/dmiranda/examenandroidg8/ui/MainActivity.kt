package com.dmiranda.examenandroidg8.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dmiranda.examenandroidg8.R
import com.dmiranda.examenandroidg8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }


}