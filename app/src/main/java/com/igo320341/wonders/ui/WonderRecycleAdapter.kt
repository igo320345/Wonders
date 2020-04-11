package com.igo320341.wonders.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.igo320341.wonders.R
import com.igo320341.wonders.model.Wonder
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.wonder_card_item.view.*

class WonderRecycleAdapter(private val wonderList: List<Wonder>, val viewModel: MainViewModel): RecyclerView.Adapter<WonderRecycleAdapter.WonderHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WonderHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return WonderHolder(layoutInflater, parent)
    }

    override fun getItemCount(): Int {
        return wonderList.size
    }

    override fun onBindViewHolder(holder: WonderHolder, position: Int) {
        holder.bind(wonderList[position])
    }

    inner class WonderHolder(inflater: LayoutInflater, viewGroup: ViewGroup)
        : RecyclerView.ViewHolder(inflater.inflate(R.layout.wonder_card_item, viewGroup, false)){

        fun bind(wonder: Wonder){
            itemView.wonder_card_name.text = wonder.name
            Picasso.get().load(wonder.pictureUrl).into(itemView.wonderImage)
            itemView.setOnClickListener{
                viewModel.wonder.value = wonder
            }
        }
    }
}