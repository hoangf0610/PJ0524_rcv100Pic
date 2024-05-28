package com.example.pj0524_rcv100pic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PicAdapter (var picList:MutableList<PicItem>): RecyclerView.Adapter<PicAdapter.PicViewHolder>() {
//    class viewholder
    inner class PicViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imgPic: ImageView = itemView.findViewById(R.id.imgPic)
        val tvNumber: TextView = itemView.findViewById(R.id.tvNumber)
        val btnPlus: Button = itemView.findViewById(R.id.btnPlus)
    }

    fun applyOddCheck() {
//      checkOdd cho mỗi item trong ds
        picList.forEach { it.checkOdd() }
    }

    fun updateData(newData: MutableList<PicItem>) {
//      update ds
        picList = newData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PicViewHolder {
//      chuyển đổi xml layout sang view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item, parent, false)
        return PicViewHolder(view)
    }

    override fun getItemCount(): Int = picList.size

    override fun onBindViewHolder(holder: PicViewHolder, position: Int) {
        val listPosition = picList[position]
//    gán các phần tử vào layout
        Glide.with(holder.imgPic.context).load(listPosition.image).into(holder.imgPic)
        holder.tvNumber.text = listPosition.number.toString()
        holder.btnPlus.setOnClickListener{
            holder.tvNumber.text = listPosition.incrementNumber().toString()
        }
    }
}