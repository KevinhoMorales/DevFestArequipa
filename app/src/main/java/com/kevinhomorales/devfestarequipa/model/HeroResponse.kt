package com.kevinhomorales.devfestarequipa.model

import com.google.gson.annotations.SerializedName


data class HeroResponse(
    @SerializedName("response")
    val response : String
)