package com.example.pmm_pitagoras_ejercicio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_pitagoras_ejercicio3.databinding.ActivityMainBinding
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPulsa.setOnClickListener {
            val cateto0 = binding.etCateto0.text.toString().toDouble()
            val cateto1 = binding.etCateto1.text.toString().toDouble()
            val resultado = sqrt(cateto0*cateto0 + cateto1*cateto1)
        }


    }
}