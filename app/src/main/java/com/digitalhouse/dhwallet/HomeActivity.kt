package com.digitalhouse.dhwallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.digitalhouse.dhwallet.adapter.HomeViewPagerAdapter

class HomeActivity : AppCompatActivity(R.layout.home_activity) {

    private val viewPagerCartao by lazy{findViewById<ViewPager2>(R.id.viewPager_cartao)}
    val listaDeCartoes = listOf(HomeCartao(),HomeCartao())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewPagerCartao.adapter = HomeViewPagerAdapter(this,listaDeCartoes)
    }
}