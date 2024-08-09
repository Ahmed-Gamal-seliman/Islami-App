package com.example.islamiapp.Home.Hadeeth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.islamiapp.Home.Constants
import com.example.islamiapp.Home.ShowActivity
import com.example.islamiapp.databinding.FragmentHadeethBinding

class HadeethFragment: Fragment() {

    lateinit var binding: FragmentHadeethBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHadeethBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val ahadeethNameList:List<String> = Constants.Hadeeth_Name_List
        val adapter: HadeethAdapter = HadeethAdapter(ahadeethNameList)
        adapter.onHadeethItemClick= object: HadeethAdapter.OnHadeethItemClickListener {
            override fun onHadeethItemClick(hadeethName:String,position:Int) {
                startHadeethActivity(hadeethName,position)
            }

        }
        binding.rvAhadeeth.adapter=adapter
        binding.rvAhadeeth.layoutManager= LinearLayoutManager(activity,RecyclerView.VERTICAL,false)
    }

    private fun startHadeethActivity(hadeethName:String,position:Int) {
        val intent: Intent = Intent(this@HadeethFragment.context, ShowActivity::class.java)




        val fileName= "Hadeeth/h${position+1}.txt"

        val lines:String= this@HadeethFragment.context?.assets?.open(fileName)?.bufferedReader().use {
            it?.readText() ?: "no hadeeth content found"
        }
        intent.putExtra(Constants.CONTENT_NAME,lines)
        intent.putExtra(Constants.HEADER_NAME,hadeethName)
        startActivity(intent)
    }
}