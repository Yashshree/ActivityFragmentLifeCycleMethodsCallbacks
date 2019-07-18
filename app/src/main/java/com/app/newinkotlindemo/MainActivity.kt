package com.app.newinkotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity","onCreate")

        /*val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.add(R.id.frameLayout, FirstFragment(), "first fragment")
        transaction.addToBackStack(null)
        transaction.commit()*/


        textview.setOnClickListener {
            /*val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.frameLayout, SecondFragment(), "second fragment")
           transaction.addToBackStack(null)
            transaction.commit()*/

            startActivity(Intent(this,SecondActivity::class.java))
        }
    }



    override fun onResume() {
        super.onResume()
        Log.e("MainActivity","onResume")
    }


    override fun onStart() {
        super.onStart()
        Log.e("MainActivity","onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity","onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity","onRestart")
    }
}


