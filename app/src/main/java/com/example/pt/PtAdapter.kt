package com.example.pt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_lkw.view.*

class PtAdapter(var ptDatas: List<PtData>):RecyclerView.Adapter<PtAdapter.PtViewHolder>() {

    inner class PtViewHolder(viewHolder: View): RecyclerView.ViewHolder(viewHolder){

        init {

            viewHolder.setOnClickListener{
                 val position: Int = adapterPosition
                Toast.makeText(itemView.context,"You clicked item # ${position + 1}", Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PtViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lkw,parent,false)
        return PtViewHolder(view)
    }

    override fun onBindViewHolder(holder: PtViewHolder, position: Int) {
        holder.itemView.apply {
            tvKfzKennzeichen.text = ptDatas[position].kfzKennzeichen
            tvTuvDate.text = ptDatas[position].TÜV
            tvSpDate.text = ptDatas[position].SP
        }
    }

    override fun getItemCount() = ptDatas.size
}