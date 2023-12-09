package com.example.utselisalab3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class itemlist(private val categories: List<category>) :
    RecyclerView.Adapter<itemlist.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.gambar.setImageResource(category.gambar)
        holder.judul.text = category.judul
        holder.kcal.text = category.kcal

    }

    override fun getItemCount(): Int = categories.size

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.img)
        val judul: TextView = itemView.findViewById(R.id.judul)
        val kcal: TextView = itemView.findViewById(R.id.kcal)

    }
}