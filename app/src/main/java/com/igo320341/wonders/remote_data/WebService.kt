package com.igo320341.wonders.remote_data

import com.igo320341.wonders.model.WonderList
import retrofit2.Call
import retrofit2.http.GET

interface WebService {
    @GET("/wonders")
    fun getWonders() : Call<WonderList>
}