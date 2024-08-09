package com.example.islamiapp.Home.Sebha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islamiapp.databinding.FragmentSebhaBinding

class SebhaFragment : Fragment(){

    lateinit var binding:FragmentSebhaBinding
    var counter:Int =0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSebhaBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSubhanaAllah.setOnClickListener(object: View.OnClickListener
        {
            override fun onClick(v: View?) {
                counter++
                binding.tvNumberOfTassbeh.text= counter.toString()
            }
        })
    }



}