package com.kotlin.multipledemos.viewModel

import androidx.lifecycle.ViewModel

class MainViewModel() : ViewModel() {

    var count = 0   //Initialisation and Keeping the value

    fun increment() {   //Incrementing the value
        count++
    }

}