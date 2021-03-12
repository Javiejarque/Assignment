package com.example.assignment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WelcomeViewModel : ViewModel() {
    private var _navigateToNextFragment = MutableLiveData<Boolean>()

    val navigateToNextFragment: LiveData<Boolean>
        get() {
            return _navigateToNextFragment
        }

    init {
        _navigateToNextFragment.value = false
    }

    fun btnNavigateNextClicked() {
        //put all the logics - check data, query db, ...
        _navigateToNextFragment.value = true

    }

    fun navigationFinished() {
        _navigateToNextFragment.value = false
    }
}