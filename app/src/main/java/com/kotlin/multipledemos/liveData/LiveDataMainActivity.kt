package com.kotlin.multipledemos.liveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kotlin.multipledemos.R

class LiveDataMainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    private val tvText: TextView
        get() = findViewById(R.id.tvText)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.factslivedata.observe(this, Observer {
            //This is a lambda function
            tvText.text = it
        })

    }

    fun Update(view: View) {
        mainViewModel.updateLiveData()
    }
}