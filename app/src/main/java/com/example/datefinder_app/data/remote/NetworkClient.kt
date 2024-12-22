package com.example.datefinder_app.data.remote

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.create


object NetworkClient {
    private const val BASE_URL = "https://localhost:5001/api/"

    // Lazy initialization of Retrofit instance
    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
