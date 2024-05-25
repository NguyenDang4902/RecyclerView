package com.example.recyclerview.custom

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.databinding.ItemMovieVerticalBinding
import com.example.recyclerview.pojo.MovieItem

class CustomChildVerticalView(var binding: ItemMovieVerticalBinding): RecyclerView.ViewHolder(binding.root) {
    var view = binding.root
    fun bind(movieItem: MovieItem) {
        binding.movieTitle.text = movieItem.title
        Glide.with(binding.movieTitle.context).load(movieItem.imageUrl).into(binding.imageThumb)
    }
}