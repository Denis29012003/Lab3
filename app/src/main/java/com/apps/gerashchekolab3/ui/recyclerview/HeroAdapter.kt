package com.apps.gerashchekolab3.ui.recyclerview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.apps.gerashchekolab3.R
import com.apps.gerashchekolab3.data.model.SuperheroInstance

import com.bumptech.glide.Glide

class HeroAdapter(
    val context: Context,
    private val dataSet: List<SuperheroInstance>
) : RecyclerView.Adapter<HeroAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewName: TextView = view.findViewById(R.id.NameTv)
        val textViewGenre: TextView = view.findViewById(R.id.SlugTv)
        val image: ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_layout, viewGroup, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.textViewName.text = dataSet[position].name
        viewHolder.textViewGenre.text = dataSet[position].slug
        Glide.with(context)
            .load(dataSet[position].images?.md)
            .circleCrop()
            .into(viewHolder.image)
    }

    override fun getItemCount() = 11
}