package com.app.newinkotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_with_fragment.*
import java.util.*
import kotlin.collections.HashSet

class ActivityWithFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_fragment)
        Log.e("ActivityWithFragment", "onCreate")
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.add(R.id.frameLayout, FirstFragment(), "first fragment")
        transaction.addToBackStack(null)
        transaction.commit()

        textview.setOnClickListener {
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.frameLayout, SecondFragment(), "second fragment")
            transaction.addToBackStack(null)
            transaction.commit()
        }




        val set=HashSet<Person>()
        set.add(Person("yashu",2))
        set.add(Person("ashu",12))
        set.add(Person("kashu",23))
        set.add(Person("mashu",1))
        set.add(Person("tashu",0))
        set.add(Person("tashu",1))

        Log.e("set",set.toString())
    }

    data class Person(var name:String,var id:Int):Comparable<Person>
    {
        override fun compareTo(other: Person): Int {
          return this.id.compareTo(other = other.id)
        }

    }

    override fun onResume() {
        super.onResume()
        Log.e("ActivityWithFragment", "onResume")
    }


    override fun onStart() {
        super.onStart()
        Log.e("ActivityWithFragment", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ActivityWithFragment", "onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ActivityWithFragment", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ActivityWithFragment", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("ActivityWithFragment", "onRestart")
    }
}
