package com.example.assesment

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface APIinterface {

    @GET("49350b51a9334df6bed177782cfbf95e/unicorns")
    fun getDetails(): Call<List<Model>>

}