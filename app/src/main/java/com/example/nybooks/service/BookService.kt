package com.example.nybooks.service

import com.example.nybooks.model.BooksResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {

    @GET("lists.json")
    fun getBooks(@Query("api-key") apiKey: String = "JkAiyA6Jdgsaeij4nutxgcCMcLiG2UZk",
                 @Query("list") listName: String = "hardcover-fiction"): Call<BooksResponse>

}