package com.example.cleaninside.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuantityViewModel: ViewModel() {
    private var _numOfCups = MutableLiveData<Int>()
    val numOfCups: LiveData<Int> get() = _numOfCups

    init{
        _numOfCups.value = 0
    }

    private fun increaseQuantity(){
        _numOfCups.value = (_numOfCups.value)?.plus(1)
    }
}