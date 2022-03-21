package com.kotlin.multipledemos.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.kotlin.multipledemos.R

class ViewModelMainActivity : AppCompatActivity() {

    lateinit var tvNum: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_main)

        mainViewModel =
            ViewModelProvider(
                this
            ).get(MainViewModel::class.java)    //Object of ViewModel Class without constructor

        tvNum = findViewById<TextView>(R.id.tvNum) //View Holding Not Performing Action
        SetText()
    }

    fun increment(view: View) {  //View Hold - Button Click
        mainViewModel.increment()
        SetText()
    }

    fun SetText() { //View Hold - SetText
        tvNum.text = mainViewModel.count.toString()
    }

}

/*
    This Demo is about : ViewModel - Whenever Our Activity Calls a Lifecycle Event such as OnCreate,OnPause,OnStart
    ,Or Any other. Our Activity Restarts & Our Views Such as Textview,Edittext,Button everything restarts and
    Textview/Editext data resets to prevent it from happening , we use View Models that Stores our Views in Saperate
    Class and Dont Let them restart whenever lifecycle event happens, Below is the demo.
*/

/*
    All the action are performed in MainViewModel Class and this class is only being used to hold the view and not
    performing action on it
*/

/*
    ViewModel Factories are used to pass parameters to our view. In our example perviously, we initialised the value
    of count in our view model itself. but now if we want to initialize it dynamically from our Main Class . We can
    pass the value using [Contructor] But for that too we have to use ViewModel Factory . We pass value to ViewModel
    Factory and That creates an object of ViewModel Accordingly. Previous Syntax without constructor is now Commented
*/