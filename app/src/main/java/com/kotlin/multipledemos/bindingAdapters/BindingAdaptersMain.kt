package com.kotlin.multipledemos.bindingAdapters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kotlin.multipledemos.R
import com.kotlin.multipledemos.databinding.ActivityBindingAdaptersMainBinding

/*
    Binding Adapters help us to bind our views to a custom code by setting the atribute of the view and calling
    Auto Code Execution - Adapter Class is Defined the project and ImageView function inside that class to set value
    of src using constructor - and using that BindAdapter in XML File
*/

class BindingAdaptersMain : AppCompatActivity() {

    lateinit var binding: ActivityBindingAdaptersMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_adapters_main)

        val post = Post(
            "This is Title",
            "This is Descriptoion",
            "https://images.unsplash.com/photo-1643306013950-fbe5297f98ae?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"
        )

        binding.postModel = post


    }
}