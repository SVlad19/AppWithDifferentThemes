package com.example.lab42foroop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab42foroop.databinding.ActivityCitationsBinding
import com.example.lab42foroop.databinding.ActivityImageBinding
import com.example.lab42foroop.databinding.ActivityImageOfEmotionsBinding

class ImageOfEmotionsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityImageOfEmotionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageOfEmotionsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnBack.setOnClickListener(){
            finish()
        }
    }
}