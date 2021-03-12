package com.example.assignment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NextViewModel : ViewModel() {
    private var _showResult = MutableLiveData<Boolean>()

    val showResult: LiveData<Boolean>
        get() {
            return _showResult
        }

    var result = MutableLiveData<String>()
    var data = MutableLiveData<String>()


    init {
        _showResult.value= false
        result.value = "init result in viewmodel"
        data.value = ""
    }
    fun btnGetDataClicked() {
        result.value = data.value
        _showResult.value = true
    }
}