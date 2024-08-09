package com.example.islamiapp.Home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.islamiapp.Home.Constants
import com.example.islamiapp.databinding.ActivityShowBinding

class ShowActivity: AppCompatActivity() {

    lateinit var binding:ActivityShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val content:String= intent.getStringExtra(Constants.CONTENT_NAME) ?: "from show Activity no content"
        val header:String= intent.getStringExtra(Constants.HEADER_NAME) ?: "from show Activity no sura header"
        binding.tvHeaderSura.text = header
        binding.tvSuraContent.text= content
    }
}