package com.example.encharet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.ToolbarWidgetWrapper
import androidx.core.view.get
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var mDrawerLayout: DrawerLayout
    lateinit var mNavigationView: NavigationView
    lateinit var mFragmentManager: FragmentManager
    lateinit var mFragmentTransaction: FragmentTransaction


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mDrawerLayout = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        mNavigationView = findViewById<View>(R.id.nav_view) as NavigationView

        mFragmentManager = supportFragmentManager

        mFragmentTransaction = mFragmentManager.beginTransaction()
        mFragmentTransaction.replace(R.id.container_view, TabFragment()).commit()

        mNavigationView.setNavigationItemSelectedListener {
            menuItem -> mDrawerLayout.closeDrawers()

            if(menuItem.itemId == R.id.nav_item_post) {
                val ft = mFragmentManager.beginTransaction()
                ft.replace(R.id.container_view, PostItemFragment()).commit()
            }

            if(menuItem.itemId == R.id.nav_item_manage) {
                val ft = mFragmentManager.beginTransaction()
                ft.replace(R.id.container_view, YourPostsFragment()).commit()
            }

            if(menuItem.itemId == R.id.nav_item_bid) {
                val ft = mFragmentManager.beginTransaction()
                ft.replace(R.id.container_view, YourBidsFragment()).commit()
            }

            false

        }

        val toolbar = findViewById<View>(R.id.toolbar) as androidx.appcompat.widget.Toolbar

        val mDrawerToggle = ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name, R.string.app_name)

        mDrawerLayout.setDrawerListener(mDrawerToggle)
        mDrawerToggle.syncState()

    }
}


