package com.example.pj0524_rcv100pic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class PictureAdapter (var pictureList:MutableList<PictureItem>, val listener: OnItemClickInterface): RecyclerView.Adapter<PictureAdapter.PictureViewHolder>() {
//    class viewholder
    inner class PictureViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imgPic: ImageView = itemView.findViewById(R.id.imgPic)
        val tvNumber: TextView = itemView.findViewById(R.id.tvNumber)
        val btnPlus: Button = itemView.findViewById(R.id.btnPlus)
    }

    interface OnItemClickInterface {
        fun onItemClick(pictureItem: PictureItem, position: Int)
    }

    fun updateData(newData: MutableList<PictureItem>) {
//      update ds
        pictureList = newData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureViewHolder {
//      chuyển đổi xml layout sang view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_picture, parent, false)
        return PictureViewHolder(view)
    }

    override fun getItemCount(): Int = pictureList.size

    override fun onBindViewHolder(holder: PictureViewHolder, position: Int) {
        val picturePosition = pictureList[position]
//    gán các phần tử vào layout
        Glide.with(holder.imgPic.context).load(picturePosition.image).into(holder.imgPic)
        holder.tvNumber.text = picturePosition.number.toString()
        holder.btnPlus.setOnClickListener{
            holder.tvNumber.text = picturePosition.incrementNumber().toString()
        }
//      sử dụng interface
        holder.imgPic.setOnClickListener{
            listener.onItemClick(picturePosition, position)
        }
    }

}