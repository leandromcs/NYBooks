package com.example.nybooks.model

data class BooksResponse (
	val status : String,
	val copyright : String,
	val num_results : Int,
	val last_modified : String,
	val results : List<Results>
)