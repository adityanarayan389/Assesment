package com.example.assesment

class UserRepository(private val userDao: UserDao){
    val alldetails:List<Model> = userDao.getAll()
         fun  insert(user:List<Model>){
        userDao.insertAll(user)
    }

}