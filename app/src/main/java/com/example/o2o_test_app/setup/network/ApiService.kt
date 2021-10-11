package com.example.o2o_test_app.setup.network

import com.example.o2o_test_app.models.api.BeerResponse
import com.example.o2o_test_app.models.api.SearchBeerResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("beers")
    suspend fun searchBeers(@Query("beer_name") name: String): Response<List<SearchBeerResponse>>

    @GET("beers/{id}")
    suspend fun getBeerById(@Path("id") id: Int): Response<List<BeerResponse>>
}
