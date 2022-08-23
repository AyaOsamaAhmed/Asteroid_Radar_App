package com.aya.asteroidradarapp.data.remote

import com.aya.asteroidradarapp.domain.response.FeedResponse
import com.aya.asteroidradarapp.domain.response.MainResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface Apis {

    @GET("/planetary/apod")
    suspend fun getDataMain(@Query("api_key") api_key:String): MainResponse?


    @GET("/neo/rest/v1/feed")
    suspend fun getDataFeed(@Query("start_date") start_date:String,@Query("end_date") end_date:String ,
        @Query("api_key") api_key:String): FeedResponse?



}