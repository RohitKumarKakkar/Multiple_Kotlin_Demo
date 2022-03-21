package com.kotlin.multipledemos.dataBinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kotlin.multipledemos.R
import com.kotlin.multipledemos.databinding.ActivityDataBindingMainBinding

class DataBindingMainActivity : AppCompatActivity() {

    lateinit var _binding: ActivityDataBindingMainBinding //Binding Object for Layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_data_binding_main) // We Can Comment this is Data Binding

        // Binding Layout File
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_main)

        //Accessing Views
        _binding.tv1.text = "This is First Text"
        _binding.tv2.text = "This is Second Text"
        _binding.btnadvanceBinding.setOnClickListener {
            val intent =
                Intent(this@DataBindingMainActivity, AdvanceBindingMainActivity::class.java)
            startActivity(intent)
        }
    }
}

/*
    This is used to Bind Views , Simply used to minimise [FINDVIEWBYID] and Updating Text/EditText Immideatly
    without using SetText. To enable this , We Have to Add DataBinding Dependency in Our Gradle Example :

    buildFeatures {
        dataBinding true
    }
*/
