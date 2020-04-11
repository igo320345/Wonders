package com.igo320341.wonders.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.igo320341.wonders.remote_data.WebService
import com.igo320341.wonders.repository.WonderRepository
import com.igo320341.wonders.ui.MainViewModel
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class MainViewModelModule {

    @Provides
    fun wonderRepository(webService: WebService): WonderRepository{
        return WonderRepository(webService)
    }

    @Provides
    fun webService(retrofit: Retrofit): WebService{
        return retrofit.create(WebService::class.java)
    }

    @Provides
    fun retrofit(gsonConverterFactory: GsonConverterFactory): Retrofit{
        return Retrofit.Builder()
            .baseUrl("http://192.168.0.101:5000")
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Provides
    fun gsonConverterFactory(gson: Gson): GsonConverterFactory{
        return GsonConverterFactory
            .create(gson)
    }

    @Provides
    fun gson(): Gson{
        return GsonBuilder()
            .create()
    }

}