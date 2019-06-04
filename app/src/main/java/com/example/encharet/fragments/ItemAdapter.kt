package com.example.cheretaviews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.encharet.R
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class ItemAdapter(val context: Context):RecyclerView.Adapter<ItemAdapter.ItemviewHolder>() {
    private val items = listOf(
        Items("car","Beky","1 birr","09/09/09"),
                Items("House","Beky","1 birr","00/08/08"),
        Items("car","Beky","1 birr","09/09/09")
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemviewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val recyclerViewitem = inflater.inflate(R.layout.recycler_view_item,parent,false)
        return ItemviewHolder(recyclerViewitem)
        //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return items.size
         //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ItemviewHolder, position: Int) {
        val item = items[position]
        holder.itemView.itemname_textview.text = item.Itemsname
        holder.itemView.usernamae_textview.text = item.username
        holder.itemView.startingprice_textview.text = item.startingprice
        holder.itemView.date_textview.text = item.date
        //To change body of created functions use File | Settings | File Templates.
    }

    class ItemviewHolder(itemview:View):RecyclerView.ViewHolder(itemview)
}