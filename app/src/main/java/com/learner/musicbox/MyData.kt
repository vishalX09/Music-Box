package com.learner.musicbox


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MyData(
    @Json(name = "data")
    val `data`: List<Data>,
    @Json(name = "next")
    val next: String,
    @Json(name = "total")
    val total: Int
)