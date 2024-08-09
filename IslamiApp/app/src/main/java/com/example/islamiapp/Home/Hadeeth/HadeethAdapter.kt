package com.example.islamiapp.Home.Hadeeth

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamiapp.R
import com.example.islamiapp.databinding.HadeethItemBinding

class HadeethAdapter(val hadeethList:List<String>): RecyclerView.Adapter<HadeethAdapter.HadeethHolder>() {

    lateinit var binding:HadeethItemBinding
    var onHadeethItemClick: OnHadeethItemClickListener?= null
      class HadeethHolder(val hadeethBinding: HadeethItemBinding): RecyclerView.ViewHolder(hadeethBinding.root)
    {

        fun bind(item:String)
        {
            hadeethBinding.tvHadeethName.text= item

        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HadeethHolder {

        binding= HadeethItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HadeethHolder(binding)
    }

    override fun onBindViewHolder(holder: HadeethHolder, position: Int) {
        val hadeethItem: String= hadeethList[position]
        holder.bind(hadeethItem)

        holder.itemView.setOnClickListener {
            onHadeethItemClick?.onHadeethItemClick(
                hadeethItem,
                position
            )
        }


    }

    override fun getItemCount(): Int {
        Log.e("size","${hadeethList.size}")
        return  hadeethList.size
    }

    interface OnHadeethItemClickListener
    {
        fun onHadeethItemClick(hadeethName:String, position:Int)
    }
}