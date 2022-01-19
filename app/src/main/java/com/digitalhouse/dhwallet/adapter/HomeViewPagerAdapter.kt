package com.digitalhouse.dhwallet.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder
import java.lang.IllegalStateException

class HomeViewPagerAdapter(
    fragmentManager: Fragment,
    private val lista: List<Fragment>
) : FragmentStateAdapter(fragmentManager) {
    override fun getItemCount(): Int {
        return lista.size
    }

    override fun createFragment(position: Int): Fragment {
        if (lista.isEmpty()) {
            throw IllegalStateException("Lista is empty")
        }
        return lista[position]
    }
}