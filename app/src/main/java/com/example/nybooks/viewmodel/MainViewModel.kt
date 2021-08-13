package com.example.nybooks.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.nybooks.repository.BooksRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val booksRepository: BooksRepository) : ViewModel(){

      fun getBooks() = liveData {
          emit(booksRepository.getBooks())
      }

}