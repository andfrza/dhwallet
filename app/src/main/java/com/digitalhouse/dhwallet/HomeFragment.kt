package com.digitalhouse.dhwallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.digitalhouse.dhwallet.adapter.HomeViewPagerAdapter
import com.digitalhouse.dhwallet.adapter.TransactionAdapter
import com.digitalhouse.dhwallet.appLists.Cartoes
import com.digitalhouse.dhwallet.appLists.TransactionsHome

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPagerCartao = view.findViewById<ViewPager2>(R.id.viewPager_cartao)
        val recyclerViewHome = view.findViewById<RecyclerView>(R.id.recycler_home)
        val listaDeCartoes = Cartoes().listaDeCartoes()

        //ViewPager2:
        viewPagerCartao.adapter = HomeViewPagerAdapter(this, listaDeCartoes)

        //RecyclerView:
        val transactionsHome = TransactionsHome()
        val listaHome = transactionsHome.listagemDeTransacoesHome()
        recyclerViewHome.adapter = TransactionAdapter(listaHome)
    }

}