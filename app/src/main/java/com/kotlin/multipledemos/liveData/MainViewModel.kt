package com.kotlin.multipledemos.liveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val mutablefactslivedata = MutableLiveData<String>("This is a fact")

    val factslivedata: LiveData<String>
        get() = mutablefactslivedata

    fun updateLiveData() {
        mutablefactslivedata.value = "This is updated Text"
    }

}