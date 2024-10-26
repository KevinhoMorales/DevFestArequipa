package com.kevinhomorales.devfestarequipa.helper

import com.kevinhomorales.devfestarequipa.network.NetworkManager
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private const val URL = "https://superheroapi.com/"

    private val retrofit =
        Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build()

    fun getInstance() : NetworkManager {
        return retrofit.create(NetworkManager::class.java)
    }
}