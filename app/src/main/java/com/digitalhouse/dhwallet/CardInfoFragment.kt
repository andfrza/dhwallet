package com.digitalhouse.dhwallet

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.CardInfoRecyclerElementsAdapter
import com.digitalhouse.dhwallet.model.Publicidade

//Este fragmento infla o layout da tela de CardInfo.

class CardInfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.cardinfo_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerElements = view.findViewById<RecyclerView>(R.id.cardinfo_recycler)
        recyclerElements.adapter = CardInfoRecyclerElementsAdapter(
            listOf(Publicidade("Promoções",mutableListOf(R.drawable.background_card,R.drawable.background_button_transacoes,R.drawable.background_button_transferir)),
                Publicidade("Descontos",mutableListOf(R.drawable.background_card,R.drawable.background_button_transacoes,R.drawable.background_button_pagamentos))))
    }
}












//botao1.setOnClickListener{
//    var intento = Intent(this,SegundaTela::class.java) //navegar para SegundaTela
//    intento.putExtra("chaveNome1",campoDeTexto1.text.toString()) //enviar dados para a segunda activity
//    intento.putExtra("chaveNome2",campoDeTexto2.text.toString()) //enviar dados para a segunda activity
//    startActivity(intento)  //navegar para SegundaTela
//
//    //Intent e extras: nossa caixinha de correio de rico - vai de A para B.
//    //putExtra: os envelopes onde enviamos nossas cartinhas.
//    //chave é o endereço de nossa casa e o valor, o conteúdo.
//
//}
//var dadosRecuperados:Bundle? =  intent.extras
////um Bundle é como um map, destinado a tráfego de dados entre uma activity A e B (não é uma memória universal).
////esse intent é um atributo já existente que está esperando para receber os valores que vêm da activity anterior.
//
//texto1 = findViewById(R.id.visualisador1)
//"Nome recebido: ${dadosRecuperados?.getString("chaveNome1")}".also { texto1.text = it }
//texto2 = findViewById(R.id.visualisador2)
//"Email recebido: ${dadosRecuperados?.getString("chaveNome2")}".also { texto2.text = it }
//
//initFragments()