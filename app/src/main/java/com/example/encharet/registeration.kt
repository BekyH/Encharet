package com.example.encharet

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class registeration : Fragment() {
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        // if(context is onloginclicked){
        //   listener = context
        //}
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_registeration, container, false)

        return view
    }
}