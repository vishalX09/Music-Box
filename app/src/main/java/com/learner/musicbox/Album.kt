package com.learner.musicbox


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Album(
    @Json(name = "cover")
    val cover: String,
    @Json(name = "cover_big")
    val coverBig: String,
    @Json(name = "cover_medium")
    val coverMedium: String,
    @Json(name = "cover_small")
    val coverSmall: String,
    @Json(name = "cover_xl")
    val coverXl: String,
    @Json(name = "id")
    val id: Int,
    @Json(name = "md5_image")
    val md5Image: String,
    @Json(name = "title")
    val title: String,
    @Json(name = "tracklist")
    val tracklist: String,
    @Json(name = "type")
    val type: String
)