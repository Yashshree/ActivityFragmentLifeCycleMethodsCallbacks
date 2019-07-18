package com.app.newinkotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.e("Second Activity","onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Second Activity","onResume")
    }


    override fun onStart() {
        super.onStart()
        Log.e("Second Activity","onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Second Activity","onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Second Activity","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Second Activity","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Second Activity","onRestart")
    }
}
