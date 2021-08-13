package com.example.nybooks.repository

import com.example.nybooks.model.BooksResponse
import com.example.nybooks.service.BookService
import javax.inject.Inject

class BooksRepository @Inject constructor(private val bookService: BookService) {

    suspend fun getBooks() : Result<BooksResponse?> {
        return try {
            val response = bookService.getBooks()
            if (response.isSuccessful) {
                Result.Success(response.body())
            } else {
                Result.Error(Exception("Falha ao buscar a lista de livros"))
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}