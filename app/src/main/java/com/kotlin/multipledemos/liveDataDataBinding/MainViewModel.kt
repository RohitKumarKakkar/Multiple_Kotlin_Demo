package com.kotlin.multipledemos.liveDataDataBinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val mutablefactslivedata = MutableLiveData<String>("This is a fact")

    fun updateLiveData() {
        mutablefactslivedata.value = "This is updated Text"
    }

}