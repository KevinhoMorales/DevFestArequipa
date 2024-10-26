package com.kevinhomorales.devfestarequipa.network

import com.kevinhomorales.devfestarequipa.model.HeroResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkManager {
    @GET("/api/10229233666327556/search/{name}")
    suspend fun getHeros(@Path("name") heroName:String): Response<HeroResponse>
}
