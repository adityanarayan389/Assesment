package com.example.assesment

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Model::class), version = 1, exportSchema = false)
abstract  class RoomDatabasge:RoomDatabase(){
    abstract fun getUserDao():UserDao
    companion object{
        @Volatile
        private var INSTANCE : RoomDatabasge? = null
        fun getUserDetailsFromDB(context:Context):RoomDatabasge{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,
                    RoomDatabasge::class.java,"user").build()
                INSTANCE=instance
                instance
            }
        }

    }
}