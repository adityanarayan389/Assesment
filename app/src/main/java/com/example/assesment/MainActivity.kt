package com.example.assesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import okhttp3.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: ViewModel
    lateinit var userRepository: UserRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        viewModel= ViewModelProvider(this).get(ViewModel::class.java)
        getData();


    }
    private fun getData() {
        val call = ApiClient.getClient.getDetails()
        call.enqueue(object : retrofit2.Callback<List<Model>> {
            override fun onResponse(
                call: retrofit2.Call<List<Model>>,
                response: retrofit2.Response<List<Model>>
            ) {
                val userlist: List<Model>? = response.body()
               Toast.makeText(this@MainActivity,"userlist",Toast.LENGTH_LONG).show()
//                if (userlist != null) {
//                    userRepository.insert(userlist)
//                }
            }

            override fun onFailure(call: retrofit2.Call<List<Model>>, t: Throwable) {

            }


        })
    }

}