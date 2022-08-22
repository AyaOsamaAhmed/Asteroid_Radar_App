package com.aya.asteroidradarapp.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aya.asteroidradarapp.domain.repositories.MainServicesImpl
import com.aya.asteroidradarapp.utils.Constant
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    var requestDataLiveData = MutableLiveData<Any>()


    init {

      mainData()
    }


    fun mainData(){
        viewModelScope.launch(Dispatchers.IO ) {
            requestDataLiveData.postValue(MainServicesImpl.getDataMain(Constant.API_KEY))
        }
    }



}