package com.huillca.lab09

import com.google.gson.annotations.*

data class PostModel(
    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String,
    @SerializedName("link") val link: String?,
@SerializedName("comment_count") val commentCount: Int?
)

