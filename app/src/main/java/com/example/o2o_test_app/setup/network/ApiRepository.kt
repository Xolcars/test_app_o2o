package com.example.o2o_test_app.setup.network

import android.content.Context
import com.example.o2o_test_app.BuildConfig
import com.example.o2o_test_app.R
import com.example.o2o_test_app.models.api.BeerResponse
import com.example.o2o_test_app.models.api.SearchBeerResponse
import com.example.o2o_test_app.setup.extensions.getJsonFromResource
import com.example.o2o_test_app.setup.network.NetworkExceptionController.checkException
import com.example.o2o_test_app.setup.network.NetworkExceptionController.checkResponse
import com.google.gson.Gson
import kotlinx.coroutines.delay

class ApiRepository(private val service: ApiService, private val context: Context) {
    val MOCK_DELAY = 1000L
    val apiKey = BuildConfig.API_KEY

    suspend fun searchBeers(
        searchInput: String,
        fake: Boolean = BuildConfig.MOCK
    ): ResponseResult<List<SearchBeerResponse>> {
        return if (!fake) {
            try {
                val response = service.searchBeers(searchInput)
                checkResponse(context, response)
            } catch (e: Exception) {
                checkException(context, e)
            }
        } else {
            delay(MOCK_DELAY)
            val json = context.getJsonFromResource(R.raw.searchmock)
            val response: List<SearchBeerResponse> = Gson().fromJson(json, Array<SearchBeerResponse>::class.java).toList()
            ResponseResult.Success(response)
        }
    }

    suspend fun beerById(
        id: Int,
        fake: Boolean = BuildConfig.MOCK
    ): ResponseResult<List<BeerResponse>> {
        return if (!fake) {
            try {
                val response = service.getBeerById(id)
                checkResponse(context, response)
            } catch (e: Exception) {
                checkException(context, e)
            }
        } else {
            delay(MOCK_DELAY)
            val json = context.getJsonFromResource(R.raw.detailmock)
            val response: List<BeerResponse> = Gson().fromJson(json, Array<BeerResponse>::class.java).toList()
            ResponseResult.Success(response)
        }
    }

}