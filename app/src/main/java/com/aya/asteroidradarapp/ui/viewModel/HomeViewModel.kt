package com.aya.asteroidradarapp.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    var requestLastNewsLiveData = MutableLiveData<Any>()


    init {

        LastestNews("bbc-news, the-next-web")
    }


    fun LastestNews(keyword: String){
        viewModelScope.launch(Dispatchers.IO ) {
          //  requestLastNewsLiveData.postValue(MainRepo.allNews(keyword))
        }
    }



}