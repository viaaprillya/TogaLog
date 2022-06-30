package com.viaaprillya.togalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ListTogaAdapter(private val listToga: ArrayList<Toga>): RecyclerView.Adapter<ListTogaAdapter.ListViewHolder>() {
    private lateinit var mListener : onItemClickListener
    inner class ListViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        var tvNamaLokal: TextView = itemView.findViewById(R.id.tv_item_nama_lokal)
        var tvNamaIlmiah: TextView = itemView.findViewById(R.id.tv_item_nama_ilmiah)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

        init{
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_toga, parent, false)
        return ListViewHolder(view, mListener)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val toga = listToga[position]
        Glide.with(holder.itemView.context)
            .load(toga.photo)
            .apply(RequestOptions().override(300, 300))
            .into(holder.imgPhoto)
        holder.tvNamaLokal.text = toga.nama_lokal
        holder.tvNamaIlmiah.text = toga.nama_ilmiah
    }

    override fun getItemCount(): Int {
        return listToga.size
    }

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener (listener: onItemClickListener){
        mListener=listener
    }
}