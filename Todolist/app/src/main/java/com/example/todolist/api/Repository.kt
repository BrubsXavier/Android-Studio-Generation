package com.example.todolist.api

import com.example.todolist.model.Category
import retrofit2.Response

class Repository {

    suspend fun listCategory(): Response<List<Category>>{
        return RetrofitInstance.api.listCategory()
    }
}