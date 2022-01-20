package com.digitalhouse.dhwallet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.R
import com.digitalhouse.dhwallet.model.Publicidade

//Este é o adapter das RecyclerView's menores, sendo chamado pela classe CardInfoRecyclerElementsAdapter
//e recebendo os Drawables necessários.

class CardInfoRecyclerPublicidadeAdapter(private val lista:List<Int>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CardInfoPublicidadeViewHolder(inflater.inflate(R.layout.cardinfo_recycler_publicidade,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is CardInfoPublicidadeViewHolder -> holder.personalizarElementos(lista[position])
        }
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}

class CardInfoPublicidadeViewHolder(view: View):RecyclerView.ViewHolder(view){
    private val publicitario = view.findViewById<CardView>(R.id.cardinfo_card_publicitario)
    fun personalizarElementos(elementoLista: Int) {
        publicitario.setCardBackgroundColor(elementoLista)
    }

}