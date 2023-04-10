package com.example.lab42foroop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab42foroop.databinding.ActivityCitationsBinding
import com.example.lab42foroop.databinding.ActivityImageBinding
import com.example.lab42foroop.databinding.ActivityImageOfSeaBinding

class ImageOfSeaActivity : AppCompatActivity() {
    private lateinit var binding : ActivityImageOfSeaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageOfSeaBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnBack.setOnClickListener(){
            finish()
        }
    }
}