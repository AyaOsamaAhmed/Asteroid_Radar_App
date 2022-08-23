package com.aya.asteroidradarapp.domain.repositories

import com.aya.asteroidradarapp.data.remote.ApiClient
import com.aya.asteroidradarapp.data.remote.Apis
import com.aya.asteroidradarapp.domain.response.FeedResponse
import com.aya.asteroidradarapp.domain.response.MainResponse

object MainServicesImpl : Apis {

    private val httpClient by lazy {
        ApiClient.instanceApi
    }


    override suspend fun getDataMain(api_key: String): MainResponse? {
        return httpClient.getDataMain(api_key)
    }

    override suspend fun getDataFeed(
        start_date: String,
        end_date: String,
        api_key: String
    ): FeedResponse? {
        return httpClient.getDataFeed(start_date,end_date,api_key)
    }


}