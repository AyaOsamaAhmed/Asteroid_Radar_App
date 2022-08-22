package com.aya.asteroidradarapp.domain.repositories

import com.aya.asteroidradarapp.data.remote.ApiClient
import com.aya.asteroidradarapp.data.remote.Apis
import com.aya.asteroidradarapp.domain.response.MainResponse

object MainServicesImpl : Apis {

    private val httpClient by lazy {
        ApiClient.instanceApi
    }


    override suspend fun getDataMain(api_key: String): MainResponse? {
        return httpClient.getDataMain(api_key)
    }


}