package com.example.islamiapp.Home.Radio

import android.media.MediaPlayer
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import androidx.fragment.app.Fragment
import com.example.islamiapp.R
import com.example.islamiapp.databinding.FragmentRadioBinding

class RadioFragment: Fragment() {

    lateinit var binding:FragmentRadioBinding
    var playAudioFlag:Boolean= true
    lateinit var mediaPlayer:MediaPlayer
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding= FragmentRadioBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mediaPlayer= MediaPlayer.create(this@RadioFragment.context,R.raw.s1)
        binding.ivPlay.setOnClickListener {
            if (!mediaPlayer.isPlaying) {
                binding.ivPlay.setImageResource(R.drawable.ic_play_audio)
                mediaPlayer.start()
            } else {
                binding.ivPlay.setImageResource(R.drawable.ic_play)
                mediaPlayer.pause()
            }
        }
//        val controller:MediaController = MediaController(this@RadioFragment.context)
//        controller.setMediaPlayer()
//        val mediaPlayer:MediaPlayer = MediaPlayer.create(this@RadioFragment.context,R.raw.s1)
//        mediaPlayer.start()



    }
}