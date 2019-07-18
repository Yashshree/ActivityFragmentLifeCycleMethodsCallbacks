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



class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("First Fragment","onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("First Fragment","onCreateView")
        return layoutInflater.inflate(R.layout.fragment_first,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("First Fragment","onViewCreated")
    }

    override fun setMenuVisibility(menuVisible: Boolean) {
        super.setMenuVisibility(menuVisible)
        Log.e("First Fragment","setMenuVisibility")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
            Log.e("First Fragment","onActivityCreated")
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.e("First Fragment","onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("First Fragment","onDetach")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("First Fragment","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("First Fragment","onDestroy")
    }
}
