package com.example.assesment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
 data class Model (@Expose
                   @SerializedName("_id") var Id : String,
                   @Expose
                   @SerializedName("name") var name : String,
                   @Expose
                   @SerializedName("age") var age : Int,
                   @Expose
                   @SerializedName("colour") var colour : String

              ){

 }

