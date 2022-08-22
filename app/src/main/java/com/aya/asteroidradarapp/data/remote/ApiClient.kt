package com.aya.asteroidradarapp.data.remote

import com.aya.asteroidradarapp.utils.Constant.BASE_URL
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private fun retrofitService(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(getGson()))
            .client(okHttpClient())
            .baseUrl(BASE_URL)
            .build()
    }

    private fun getGson(): Gson {
        return GsonBuilder().setLenient().create()
    }


    private fun okHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    val instanceApi: Apis by lazy {
        retrofitService().create(Apis::class.java)
    }
}