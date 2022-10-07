package com.example.listusers.data

import com.example.listusers.data.User
import com.example.listusers.data.UserDao

class UserRepository(private val userDao: UserDao) {

    val selectUser = userDao.selectusers()

    fun addUser(user: User) {
        userDao.addUser(user)
    }
}