package com.example.api

data class MyData(
    val `data`: List<Data>,
    val next: String,
    val total: Int
)