package com.kotlin.multipledemos.lifeCycleAwareDemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kotlin.multipledemos.R

/*
    This Demo is about : Lifecycle Aware Components - Whenever Our Activity Calls a Lifecycle Event such as OnCreate,
    OnPause,OnStart,Or Any other. Our Lifecycle Component Observer will catch that particular event and perform action
    Accordingly , Below is the demo.
*/

class LifeCycleMainActivity : AppCompatActivity() {

    val name: String = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_main)
        lifecycle.addObserver(Observer())
        Log.d(name, "On Create")

    }

    override fun onStart() {
        super.onStart()
        Log.d(name, "On Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d(name, "On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(name, "On Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(name, "On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(name, "On Destroy")
    }

}