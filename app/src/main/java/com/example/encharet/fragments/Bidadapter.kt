package com.example.cheretaviews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.encharet.R
import kotlinx.android.synthetic.main.fragment_your_bids.view.*

class Bidadapter(val context: Context):RecyclerView.Adapter<Bidadapter.BidViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BidViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val recyclerbid = inflater.inflate(R.layout.recycler_view_bid,parent,false)
        return BidViewHolder(recyclerbid)
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: BidViewHolder, position: Int) {

    }

    class BidViewHolder(bidView:View):RecyclerView.ViewHolder(bidView)

}