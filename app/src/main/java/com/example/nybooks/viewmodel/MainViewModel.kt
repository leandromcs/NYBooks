package com.example.nybooks.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.nybooks.model.BooksResponse
import com.example.nybooks.repository.BooksRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val booksRepository: BooksRepository) : ViewModel(){

    lateinit var booksResponse: LiveData<BooksResponse>

    fun getBooks() {
        booksResponse = booksRepository.getBooks()
    }
}