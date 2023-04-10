package com.example.lab42foroop

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab42foroop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //

        binding.ivImage.setOnClickListener(){
            val intent = Intent(this,ImageActivity::class.java)
            startActivity(intent)
        }
        binding.tvImage.setOnClickListener(){
            val intent = Intent(this,ImageActivity::class.java)
            startActivity(intent)
        }

        //

        binding.ivJokes.setOnClickListener(){
            val intent = Intent(this,JokeActivity::class.java)
            startActivity(intent)
        }
        binding.tvJokes.setOnClickListener(){
            val intent = Intent(this,JokeActivity::class.java)
            startActivity(intent)
        }

        //

        binding.ivOmens.setOnClickListener(){
            val intent = Intent(this,OmenActivity::class.java)
            startActivity(intent)
        }
        binding.tvOmens.setOnClickListener(){
            val intent = Intent(this,OmenActivity::class.java)
            startActivity(intent)
        }

        //

        binding.ivCitations.setOnClickListener(){
            val intent = Intent(this,CitationsActivity::class.java)
            startActivity(intent)
        }
        binding.tvCitations.setOnClickListener(){
            val intent = Intent(this,CitationsActivity::class.java)
            startActivity(intent)
        }

        //

        binding.ivSea.setOnClickListener(){
            val intent = Intent(this,ImageOfSeaActivity::class.java)
            startActivity(intent)
        }
        binding.tvSea.setOnClickListener(){
            val intent = Intent(this,ImageOfSeaActivity::class.java)
            startActivity(intent)
        }

        //

        binding.ivEmotions.setOnClickListener(){
            val intent = Intent(this,ImageOfEmotionsActivity::class.java)
            startActivity(intent)
        }
        binding.tvEmotions.setOnClickListener(){
            val intent = Intent(this,ImageOfEmotionsActivity::class.java)
            startActivity(intent)
        }

        //

        binding.tvAuthor.setOnClickListener(){
            val intent = Intent(this,Author::class.java)
            startActivity(intent)
        }
    }
}