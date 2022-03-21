package com.kotlin.multipledemos.dataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kotlin.multipledemos.R
import com.kotlin.multipledemos.databinding.ActivityAdvanceBindingMainBinding

class AdvanceBindingMainActivity : AppCompatActivity() {

    lateinit var _binding: ActivityAdvanceBindingMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_advance_binding_main)

        _binding = DataBindingUtil.setContentView(this, R.layout.activity_advance_binding_main)

        val dataObj = ModelData("This is Text 1 Advance", "This is Text 2 Advance")
        _binding.advanceddata = dataObj

    }
}