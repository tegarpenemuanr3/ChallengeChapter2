package com.tegarpenemuan.minichallenge2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tegarpenemuan.challengechapter2.R
import com.tegarpenemuan.minichallenge2.model.CategoryTokpedModel
import com.tegarpenemuan.minichallenge2.model.SliderTokpedModel

class SlideTokped(private val list: List<SliderTokpedModel>): RecyclerView.Adapter<SlideTokped.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageAvatar = itemView.findViewById<ImageView>(R.id.image_view)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_home_slider, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: SliderTokpedModel = list[position]
        holder.imageAvatar.setImageResource(item.avatar)
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}