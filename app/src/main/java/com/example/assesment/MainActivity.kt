package com.example.assesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import okhttp3.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData();


    }
    private fun getData() {
        val call = ApiClient.getClient.getDetails()
        call.enqueue(object : retrofit2.Callback<List<Model>> {
            override fun onResponse(
                call: retrofit2.Call<List<Model>>,
                response: retrofit2.Response<List<Model>>
            ) {

                

            }

            override fun onFailure(call: retrofit2.Call<List<Model>>, t: Throwable) {

            }


        })
    }

}