package ru.netology.nmedia.repository

import ru.netology.nmedia.dto.Post

interface PostRepository {
    fun getAll(): List<Post>
    fun likeById(id: Long, isDislike: Boolean): Post
    fun save(post: Post)
    fun removeById(id: Long)
}
