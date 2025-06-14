package ru.netology.nmedia.dto

data class Post(
    val id: Long? = null,
    val author: String,
    val authorAvatar: String,
    val content: String,
    val published: String,
    val likedByMe: Boolean,
    val likes: Int = 0,
)

