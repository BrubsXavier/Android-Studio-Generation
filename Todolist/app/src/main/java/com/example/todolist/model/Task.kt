package com.example.todolist.model

data class Task (
    var id: Long,
    var nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: Category
        ) {

}