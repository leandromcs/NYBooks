package com.example.nybooks.di

import com.example.nybooks.repository.BooksRepository
import com.example.nybooks.service.BookService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class BooksRepositoryModule {

    @Singleton
    @Provides
    fun provideBooksRepository(bookService: BookService): BooksRepository {
        return BooksRepository(bookService)
    }
}