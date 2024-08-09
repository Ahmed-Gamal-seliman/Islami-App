package com.example.islamiapp.Home.Quran

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.islamiapp.R
import com.example.islamiapp.databinding.QuranItemBinding

class ChaptersAdapter(val chaptersList: List<String>): RecyclerView.Adapter<ChaptersAdapter.ChapterHolder>() {

    lateinit var binding:QuranItemBinding

    var onItemClick: OnItemClickListener?=null

    class ChapterHolder(val quranBinding : QuranItemBinding): ViewHolder(quranBinding.root)
    {

        fun bind(chapter:String)
        {
            quranBinding.tvSuraName.text= chapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterHolder {
        binding= QuranItemBinding.inflate(LayoutInflater.from(parent.context))

        return ChapterHolder(binding)
    }

    override fun getItemCount(): Int= chaptersList.size



    override fun onBindViewHolder(holder: ChapterHolder, position: Int) {
        val chapter: String= chaptersList[position]

        holder.bind(chapter)

        holder.itemView.setOnClickListener(View.OnClickListener {
            onItemClick?.onItemClick(chapter,position)
        })

    }

    interface OnItemClickListener
    {
        fun onItemClick(suraName:String,position:Int):Unit
    }

}