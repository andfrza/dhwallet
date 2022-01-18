package com.digitalhouse.dhwallet.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomeViewPagerAdapter(fragmentManager: FragmentActivity, private val lista:List<Fragment>):FragmentStateAdapter(fragmentManager) {
    override fun getItemCount(): Int {
        return lista.size
    }

    override fun createFragment(position: Int): Fragment {
        return lista[position]
    }
}