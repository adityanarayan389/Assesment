package com.example.assesment

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
@Entity(tableName = "user")
 data class Model (@Expose
                   @SerializedName("_id") var Id : String,
                   @Expose
                   @SerializedName("name") var namei : String,
                   @Expose
                   @SerializedName("age") var agew : Int,
                   @Expose
                   @SerializedName("colour") var colour : String,


              ){

    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "Name") val name: String,
    @ColumnInfo(name = "Age") val age: String,
    @ColumnInfo(name = "Color") val color: String



 }

