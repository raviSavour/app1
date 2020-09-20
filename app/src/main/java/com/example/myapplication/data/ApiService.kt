package com.example.myapplication.data

import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "4e44d9029b1270a757cddc766a1bcb63"


interface ApiService {
    @GET("results.json")
    fun getResult(

        @Query(value = "q") location: String,
        @Query(value = "lang") languagecode: String = "en"
    


    )
}