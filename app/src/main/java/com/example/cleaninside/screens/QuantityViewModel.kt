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

    fun increaseQuantity(){
        _numOfCups.value = (_numOfCups.value)?.plus(1)
    }

    fun decreaseQuantity(){
        _numOfCups.value =(_numOfCups.value)?.minus(1)
    }
}