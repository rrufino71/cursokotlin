package com.example.cursoaristidevs.superheroapp

import com.google.gson.annotations.SerializedName

//si uso serializedname especifico que en el json
//se llama response y yo lo voy a guardar en response
// si tiene {}  es un objeto
//si tiene [] es una lista

data class SuperHeroDataResponse(
    @SerializedName("response") val response:String,
    @SerializedName("results") val superheroes: List< SuperheroItemResponse>
)


data class  SuperheroItemResponse(
    @SerializedName("id") val superheroId:String,
    @SerializedName("name") val name:String
)