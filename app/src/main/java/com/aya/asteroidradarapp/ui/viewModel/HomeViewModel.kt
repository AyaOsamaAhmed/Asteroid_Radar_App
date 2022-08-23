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
    var requestFeedDataLiveData = MutableLiveData<Any>()

    init {

      mainData()
    }


    fun mainData(){
        viewModelScope.launch(Dispatchers.IO ) {
            requestDataLiveData.postValue(MainServicesImpl.getDataMain(Constant.API_KEY))
        }
    }

    fun feedData( start_date: String, end_date: String){
        viewModelScope.launch(Dispatchers.IO ) {
            requestFeedDataLiveData.postValue(MainServicesImpl.getDataFeed(start_date,end_date,Constant.API_KEY))
        }
    }



}