package com.apps.gerashchekolab3.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData



class FirstViewModel(app: Application) : AndroidViewModel(app) {
    private val _destination = MutableLiveData<String?>(null)
    val destination: LiveData<String?> get() = _destination
    fun start(){
        _destination.value = ""
    }
}