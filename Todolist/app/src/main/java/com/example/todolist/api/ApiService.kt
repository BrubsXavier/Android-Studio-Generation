package com.example.todolist.api

import com.example.todolist.model.Category
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("categoria")

    suspend fun  listCategory(): Response<List<Category>>
}