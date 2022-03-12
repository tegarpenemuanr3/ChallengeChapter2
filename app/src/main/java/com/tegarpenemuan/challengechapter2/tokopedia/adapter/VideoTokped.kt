package com.tegarpenemuan.minichallenge2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tegarpenemuan.challengechapter2.R
import com.tegarpenemuan.challengechapter2.tokopedia.model.VideoTokopedia

class VideoTokped(private val list: List<VideoTokopedia>): RecyclerView.Adapter<VideoTokped.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageAvatar = itemView.findViewById<ImageView>(R.id.img_video)
        val title = itemView.findViewById<TextView>(R.id.tv_title)
        val diskon = itemView.findViewById<TextView>(R.id.tv_diskon)
        val desc = itemView.findViewById<TextView>(R.id.tv_desc)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_video_tokopedia, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: VideoTokopedia = list[position]
        holder.title.text = item.title
        holder.diskon.text = item.diskon
        holder.desc.text = item.desc
        holder.imageAvatar.setImageResource(item.avatar)
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}