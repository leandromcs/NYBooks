package com.example.nybooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nybooks.adapter.BookAdapter
import com.example.nybooks.databinding.ActivityMainBinding
import com.example.nybooks.model.BooksResponse
import com.example.nybooks.repository.Result
import com.example.nybooks.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val viewModel by viewModels<MainViewModel>()

        viewModel.getBooks().observe(this) {
            when(it) {
                is Result.Success -> {
                    binding.rvBooks.apply {
                        layoutManager = LinearLayoutManager(context)
                        setHasFixedSize(true)
                        adapter = BookAdapter(it.data?.results!!)
                    }
                }
                is Result.Error -> {
                    println(it.exception.message)
                }
            }
        }
    }

}