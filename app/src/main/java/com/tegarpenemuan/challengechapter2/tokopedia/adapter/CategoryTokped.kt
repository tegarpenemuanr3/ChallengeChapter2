package com.tegarpenemuan.minichallenge2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tegarpenemuan.challengechapter2.R
import com.tegarpenemuan.minichallenge2.model.CategoryTokpedModel

class CategoryTokped(private val list: List<CategoryTokpedModel>): RecyclerView.Adapter<CategoryTokped.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageAvatar = itemView.findViewById<ImageView>(R.id.image_view)
        val textDesc = itemView.findViewById<TextView>(R.id.tv_desc)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_home_category, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: CategoryTokpedModel = list[position]
        holder.textDesc.text = item.desc
        holder.imageAvatar.setImageResource(item.avatar)
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}