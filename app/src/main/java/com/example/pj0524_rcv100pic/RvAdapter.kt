package com.example.pj0524_rcv100pic

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RvAdapter (var ds:List<Item>): RecyclerView.Adapter<RvAdapter.PicViewHolder>() {
//    class viewholder
    inner class PicViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PicViewHolder {
//        chuyển đổi xml layout sang view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item, parent, false)
        return PicViewHolder(view)
    }

    override fun getItemCount(): Int {
//        hiển thị all phần tử trong ds
        return ds.size
    }



    override fun onBindViewHolder(holder: PicViewHolder, position: Int) {
//    gán các phần tử vào layout
//        holder.itemView.findViewById<ImageView>(R.id.imgPic).setImageResource(ds[position].image.toInt())
        Glide.with(holder.itemView.findViewById<ImageView>(R.id.imgPic)).load(ds[position].image).into(holder.itemView.findViewById<ImageView>(R.id.imgPic))
        holder.itemView.findViewById<TextView>(R.id.tvNumber).text = ds[position].number.toString()
        holder.itemView.findViewById<Button>(R.id.btnPlus).setOnClickListener{
            ds[position].incrementNumber()
            holder.itemView.findViewById<TextView>(R.id.tvNumber).text = ds[position].number.toString()
        }

        ds[position].checkOdd()

    }


}