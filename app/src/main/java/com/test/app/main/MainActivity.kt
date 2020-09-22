package com.test.app.main

import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.test.app.R
import com.test.app.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun setLayoutId(): Int = R.layout.activity_main

    override fun initView() {
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)
        val navController = Navigation.findNavController(this,
            R.id.nav_host_fragment
        )
        NavigationUI.setupWithNavController(navView, navController)
    }

}
