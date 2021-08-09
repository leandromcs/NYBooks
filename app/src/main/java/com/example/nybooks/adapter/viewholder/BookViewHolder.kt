package com.example.nybooks.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.nybooks.databinding.BookViewHolderBinding
import com.example.nybooks.model.BookDetails
import com.example.nybooks.model.Results

class BookViewHolder(private var binding: BookViewHolderBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(book: Results) {
        binding.tvTitulo.text = book.book_details[0].title
        binding.tvAutor.text = book.book_details[0].author
    }

}
