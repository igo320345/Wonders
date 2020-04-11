package com.igo320341.wonders.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.igo320341.wonders.model.WonderList
import com.igo320341.wonders.remote_data.WebService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WonderRepository @Inject constructor(private val webService: WebService) {
    fun getWonders(): LiveData<WonderList>{
        val data = MutableLiveData<WonderList>()
        webService.getWonders().enqueue(object : Callback<WonderList> {
            override fun onResponse(call: Call<WonderList>, response: Response<WonderList>) {
                data.value = response.body()
            }
            override fun onFailure(call: Call<WonderList>, t: Throwable) {

            }
        })
        return data
    }
}