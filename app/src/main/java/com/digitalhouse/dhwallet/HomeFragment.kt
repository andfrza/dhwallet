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
import com.digitalhouse.dhwallet.util.CustomPageTransformer
import com.digitalhouse.dhwallet.util.decorator.HorizontalMarginItemDecoration

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

        //Definição das variáveis:
        val viewPagerCartao = view.findViewById<ViewPager2>(R.id.viewPager_cartao)
        val recyclerViewHome = view.findViewById<RecyclerView>(R.id.recycler_home)
        val listaDeCartoes = Cartoes().listaDeCartoes()

        //ViewPager2:
        viewPagerCartao.adapter = HomeViewPagerAdapter(this, listaDeCartoes)
        viewPagerCartao.addItemDecoration(HorizontalMarginItemDecoration(view.context,R.dimen.viewpager_current_item_horizontal_margin))
        viewPagerCartao.setPageTransformer(CustomPageTransformer(view.context))
        viewPagerCartao.offscreenPageLimit = 1

        //RecyclerView:
        val transactionsHome = TransactionsHome()
        val listaHome = transactionsHome.listagemDeTransacoesHome()
        recyclerViewHome.adapter = TransactionAdapter(listaHome)
    }

}