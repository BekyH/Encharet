package com.example.encharet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class TabFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.tab_layout, null)

        tabLayout = view.findViewById<View>(R.id.tabs) as TabLayout
        viewPager = view.findViewById<View>(R.id.view_pager) as ViewPager

        viewPager.adapter = MyAdapter(childFragmentManager)
        tabLayout.post {
            tabLayout.setupWithViewPager(viewPager)
        }

        return view
    }

    internal inner class MyAdapter (fm: FragmentManager): FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment? {
            when(position) {
                0 -> return ShowPostsFragment()
                1 -> return YourPostsFragment()
                2 -> return YourBidsFragment()
                3 -> return StatusFragment()
            }
            return null
        }

        override fun getCount(): Int {
            return numberOfItems
        }

        override fun getPageTitle(position: Int): CharSequence? {
            when(position) {
                0 -> return "Posts"
                1 -> return "Your Posts"
                2 -> return "Your Bids"
                3 -> return "Status"
            }
            return null
        }

    }

    companion object {
        lateinit var tabLayout: TabLayout
        lateinit var viewPager: ViewPager
        var numberOfItems = 4
    }
}