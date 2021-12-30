package com.example.assesment

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class ViewModel(application: Application) :AndroidViewModel(application) {

    val allusers : List<Model>
    init {
        val database = RoomDatabasge.getUserDetailsFromDB(application).getUserDao()
        val repo = UserRepository(database)
        allusers = repo.alldetails
    }
}