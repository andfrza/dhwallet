package com.digitalhouse.dhwallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.digitalhouse.dhwallet.adapter.HomeViewPagerAdapter
import com.digitalhouse.dhwallet.adapter.TransactionAdapter
import com.digitalhouse.dhwallet.appLists.Cartoes
import com.digitalhouse.dhwallet.appLists.TransactionsHome

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            //.replace(R.id.fragment_container,TransactionFragment.newInstance("R$ 45,35","R$ 536"))
            //.replace(R.id.fragment_container,TransferFragment())
            .replace(R.id.fragment_container,HomeFragment())
            //.addToBackStack("transaction_fragment") //salvar o estado deste fragmento para voltar mediante o clique.
            .commit()
    }
}