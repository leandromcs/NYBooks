package com.example.nybooks.repository

import com.example.nybooks.model.BooksResponse
import retrofit2.Call
import retrofit2.Callback
import androidx.lifecycle.MutableLiveData
import com.example.nybooks.service.BookService
import retrofit2.Response
import javax.inject.Inject

class BooksRepository @Inject constructor(private val bookService: BookService) {

    fun getBooks() : MutableLiveData<BooksResponse> {
        val result : MutableLiveData<BooksResponse> = MutableLiveData()

        bookService.getBooks().enqueue(object : Callback<BooksResponse> {
            override fun onResponse(
                call: Call<BooksResponse>,
                response: Response<BooksResponse>
            ) {
                result.value = response.body()
            }

            override fun onFailure(call: Call<BooksResponse>, t: Throwable) {
                result.postValue(null)
            }
        })

        return result
    }
}