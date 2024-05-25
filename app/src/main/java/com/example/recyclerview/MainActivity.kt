package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.CategoryParentAdapter
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.pojo.MovieContent

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var categoryParentAdapter: CategoryParentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        categoryParentAdapter = CategoryParentAdapter()
        binding.container.recycleview.layoutManager = LinearLayoutManager(this)
        binding.container.recycleview.adapter = categoryParentAdapter
        categoryParentAdapter.addAllCategory(MovieContent.getMovieContent())
    }
}