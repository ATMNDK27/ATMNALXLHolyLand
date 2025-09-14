package com.example.atmnalxlapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    private val _count = MutableLiveData<Int>()
    val count: LiveData<Int> = _count
}