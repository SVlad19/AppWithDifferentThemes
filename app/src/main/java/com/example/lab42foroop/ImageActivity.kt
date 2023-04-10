package com.example.lab42foroop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab42foroop.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {
    private lateinit var binding : ActivityImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnBack.setOnClickListener(){
            finish()
        }
    }
}