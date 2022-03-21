package com.kotlin.multipledemos.liveDataDataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.marginBottom
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kotlin.multipledemos.R
import com.kotlin.multipledemos.databinding.ActivityLiveDataBindingMainBinding

class LiveDataBindingMainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    lateinit var binding: ActivityLiveDataBindingMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_live_data_binding_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_data_binding_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.edtText
        binding.livedatabinding = mainViewModel
        binding.lifecycleOwner = this

    }
}