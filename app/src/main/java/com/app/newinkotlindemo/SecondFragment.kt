package com.app.newinkotlindemo

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Second Fragment","onCreate")

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("Second Fragment","onActivityCreated")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.e("SecondFragment","onActivityResult")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.e("Second Fragment","onCreateView")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun setMenuVisibility(menuVisible: Boolean) {
        super.setMenuVisibility(menuVisible)
        Log.e("Second Fragment","setMenuVisibility")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("Second Fragment","onViewCreated")
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.e("Second Fragment","onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("Second Fragment","onDetach")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("Second Fragment","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Second Fragment","onDestroy")
    }
}
