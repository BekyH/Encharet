package com.example.tabbed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.encharet.Bidadapter
import com.example.encharet.R
import kotlinx.android.synthetic.main.fragment_your_bids.view.*

class YourBidsFragment: Fragment() {
    lateinit var recyclerbid: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_your_bids, container, false)
        //recyclerbid = view.recycler_bid
      //  recyclerbid.layoutManager = LinearLayoutManager(requireContext())
       // recyclerbid.adapter = Bidadapter(requireContext())

        return view
    }
}