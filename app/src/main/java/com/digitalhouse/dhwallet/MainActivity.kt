package com.digitalhouse.dhwallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {

    private val fragmentContainer: FragmentContainerView by lazy{findViewById(R.id.fragment_container)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,TransactionFragment.newInstance("R$ 45,35","R$ 536"))
            .addToBackStack("transaction_fragment") //salvar o estado deste fragmento para voltar mediante o clique.
            .commit()
    }
}