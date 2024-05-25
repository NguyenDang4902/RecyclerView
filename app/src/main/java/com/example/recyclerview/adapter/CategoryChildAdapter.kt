package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclerview.custom.CustomChildHorizontalView
import com.example.recyclerview.custom.CustomChildVerticalView
import com.example.recyclerview.databinding.ItemMovieHorizontalBinding
import com.example.recyclerview.databinding.ItemMovieVerticalBinding
import com.example.recyclerview.pojo.HORIZONTAL
import com.example.recyclerview.pojo.MovieItem
import com.example.recyclerview.pojo.VERTICAL

const val VERTICAL_VIEW = 1
const val HORIZONTAL_VIEW = 2

class CategoryChildAdapter(var type: String): RecyclerView.Adapter<ViewHolder>() {
    var movieList : MutableList<MovieItem> = arrayListOf()

    fun addAllMovieList(item: List<MovieItem>) {
        movieList.addAll(item)
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            type.contains(VERTICAL) -> VERTICAL_VIEW
            type.contains(HORIZONTAL) -> HORIZONTAL_VIEW
            else -> VERTICAL_VIEW
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when(viewType) {
            VERTICAL_VIEW -> CustomChildVerticalView(ItemMovieVerticalBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            HORIZONTAL_VIEW -> CustomChildHorizontalView(ItemMovieHorizontalBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            else -> CustomChildVerticalView(ItemMovieVerticalBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }
    }

    override fun getItemCount(): Int = movieList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var movieObject = movieList[position]
        when (getItemViewType(position)) {
            HORIZONTAL_VIEW -> {
                var holder = holder as CustomChildHorizontalView
                holder.bind(movieItem = movieObject)
            }
            VERTICAL_VIEW -> {
                var holder = holder as CustomChildVerticalView
                holder.bind(movieItem = movieObject)
            }
        }
    }

}