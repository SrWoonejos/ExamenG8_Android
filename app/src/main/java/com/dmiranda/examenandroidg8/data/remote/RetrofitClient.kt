package com.dmiranda.examenandroidg8.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object {
        private const val BASE_URL = "https://api.escuelajs.co/api/v1/categories"

        fun retrofitInstance(): RetrofitApi {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(RetrofitApi::class.java)
        }
    }


}