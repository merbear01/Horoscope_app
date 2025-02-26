package com.example.emergescreenshots.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Home screen of the horoscope app"
    }
    val text: LiveData<String> = _text
}


