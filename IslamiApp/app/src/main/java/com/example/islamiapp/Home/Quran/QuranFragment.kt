package com.example.islamiapp.Home.Quran

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
import com.example.islamiapp.databinding.FragmentQuranBinding

class QuranFragment: Fragment() {

    lateinit var binding: FragmentQuranBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentQuranBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



       val chaptersAdapter: ChaptersAdapter = ChaptersAdapter(Constants.SURA_NAME_LIST)
        chaptersAdapter.onItemClick = object: ChaptersAdapter.OnItemClickListener {
            override fun onItemClick(suraName:String,position:Int) {
                startSuraActivity(suraName,position)
            }
        }
        binding.rvSuraName.adapter=chaptersAdapter

        binding.rvSuraName.layoutManager=LinearLayoutManager(activity,RecyclerView.VERTICAL,false)


    }

    private fun startSuraActivity(suraName:String,position:Int) {
        val intent: Intent = Intent(this@QuranFragment.context, ShowActivity::class.java)




        val fileName= "Quran/${position+1}.txt"

        val lines:String= this@QuranFragment.context?.assets?.open(fileName)?.bufferedReader().use {
            it?.readText() ?: "no sura content found"
        }
        intent.putExtra(Constants.CONTENT_NAME,lines)
        intent.putExtra(Constants.HEADER_NAME,suraName)
        startActivity(intent)
    }
}