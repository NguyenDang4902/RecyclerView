package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclerview.databinding.ItemParentHorizontalRecycleviewBinding
import com.example.recyclerview.databinding.ItemParentVerticalRecycleviewBinding
import com.example.recyclerview.pojo.HORIZONTAL
import com.example.recyclerview.pojo.MovieContent
import com.example.recyclerview.pojo.VERTICAL

class CategoryParentAdapter: RecyclerView.Adapter<ViewHolder>() {
    var categoryList: MutableList<MovieContent> = arrayListOf()
    private var categoryChildAdapter: CategoryChildAdapter ?= null

    fun addAllCategory(category: List<MovieContent>) {
        categoryList.addAll(category)
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return when(categoryList[position].type) {
            VERTICAL -> VERTICAL_VIEW
            HORIZONTAL -> HORIZONTAL_VIEW
            else -> VERTICAL_VIEW
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when(viewType) {
            VERTICAL_VIEW -> CustomParentVerticalView(ItemParentVerticalRecycleviewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            HORIZONTAL_VIEW -> CustomParentHorizontalView(ItemParentHorizontalRecycleviewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            else -> CustomParentVerticalView(ItemParentVerticalRecycleviewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }
    }

    override fun getItemCount(): Int = categoryList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var movieContent = categoryList[position]
        when (getItemViewType(position)) {
            VERTICAL_VIEW -> {
                var holder = holder as CustomParentVerticalView
                holder.bind(movieContent = movieContent)
            }
            HORIZONTAL_VIEW -> {
                var holder = holder as CustomParentHorizontalView
                holder.bind(movieContent = movieContent)
            }
        }
    }

    inner class CustomParentVerticalView(var binding: ItemParentVerticalRecycleviewBinding): RecyclerView.ViewHolder(binding.root) {
        var view = binding.root
        init {
            binding.parentRecycleview.setHasFixedSize(true)
            binding.parentRecycleview.isNestedScrollingEnabled = false
            binding.parentRecycleview.layoutManager = LinearLayoutManager(binding.textCategory.context, LinearLayoutManager.HORIZONTAL, false)

        }
        fun bind(movieContent: MovieContent) {
            categoryChildAdapter = CategoryChildAdapter(type = movieContent.type)
            var pool = RecyclerView.RecycledViewPool()
            binding.parentRecycleview.setRecycledViewPool(pool)
            binding.parentRecycleview.adapter = categoryChildAdapter
            categoryChildAdapter!!.addAllMovieList(movieContent.movieList)
            binding.textCategory.text = movieContent.categoryTitle
        }
    }
    inner class CustomParentHorizontalView(var binding: ItemParentHorizontalRecycleviewBinding): RecyclerView.ViewHolder(binding.root) {
        var view = binding.root
        init {
            binding.parentRecycleview.setHasFixedSize(true)
            binding.parentRecycleview.isNestedScrollingEnabled = false
            binding.parentRecycleview.layoutManager = LinearLayoutManager(binding.textCategory.context, LinearLayoutManager.HORIZONTAL, false)

        }
        fun bind(movieContent: MovieContent) {
            categoryChildAdapter = CategoryChildAdapter(type = movieContent.type)
            var pool = RecyclerView.RecycledViewPool()
            binding.parentRecycleview.setRecycledViewPool(pool)
            binding.parentRecycleview.adapter = categoryChildAdapter
            categoryChildAdapter!!.addAllMovieList(movieContent.movieList)
            binding.textCategory.text = movieContent.categoryTitle
        }
    }
}