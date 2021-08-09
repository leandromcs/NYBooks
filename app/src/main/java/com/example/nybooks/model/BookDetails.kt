package com.example.nybooks.model

data class BookDetails (
	val title : String,
	val description : String,
	val contributor : String,
	val author : String,
	val contributor_note : String,
	val price : Int,
	val age_group : String,
	val publisher : String,
	val primary_isbn13 : String,
	val primary_isbn10 : String
)