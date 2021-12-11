package ru.netology.nmedia.repository

import ru.netology.nmedia.dto.Post

interface PostRepository {
    fun getAll(): List<Post>
    fun likeById(id: Long, isDislike: Boolean): Post
    fun save(post: Post)
    fun removeById(id: Long)

    fun getAllAsync(callback: RepositoryCallback<List<Post>>)
    fun likeByIdAsync(id: Long, isDislike: Boolean, callback: RepositoryCallback<Post>)
    fun saveAsync(post: Post, callback: RepositoryCallback<Post>)
    fun removeByIdAsync(id: Long, errorCallback: () -> Unit)

    interface RepositoryCallback<T> {
        fun onSuccess(value: T)
        fun onError()
    }
}
