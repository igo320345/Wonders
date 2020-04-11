package com.igo320341.wonders.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.igo320341.wonders.model.Wonder
import com.igo320341.wonders.model.WonderList
import com.igo320341.wonders.repository.WonderRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(wonderRepository: WonderRepository) : ViewModel(){
    val wonders: LiveData<WonderList> = wonderRepository.getWonders()
    var wonder = MutableLiveData<Wonder>()

}