package com.example.cryptotrackerapp.service

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val BASE_URL= "https://api.coincap.io/v2/"
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val assetsService: AssetsService by  lazy{
        retrofit.create(AssetsService::class.java)
    }
}