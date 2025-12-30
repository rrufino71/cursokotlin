package com.example.cursoaristidevs.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/7ad8cc10c89513e7c6ef50c91fe0007b/search/{name}")
    suspend fun getSuperheroes(@Path("name") superHeroName: String): Response<SuperHeroDataResponse> //async

    @GET("/api/7ad8cc10c89513e7c6ef50c91fe0007b/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId: String): Response<SuperHeroDetailResponse>
}