package com.aya.asteroidradarapp.data.remote

import com.aya.asteroidradarapp.domain.response.MainResponse


interface Apis {

    suspend fun allNews( keyword:String): MainResponse?

}