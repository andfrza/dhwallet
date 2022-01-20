package com.digitalhouse.dhwallet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.R
import com.digitalhouse.dhwallet.model.Publicidade

//Este é o adapter para a RecyclerView da tela de CardInfo que engloba os RecyclerView's menores.
//Nele é inflado o título da categoria diretamente (desconto, promoção....) e passado uma lista de publicitários para
//o adapter das RecyclerView's menores.

class CardInfoRecyclerElementsAdapter(private val lista:List<Publicidade>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CardInfoElementsViewHolder(inflater.inflate(R.layout.cardinfo_recycler_elementos_unitarios,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is CardInfoElementsViewHolder -> holder.personalizarElementos(lista[position])
        }
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}

class CardInfoElementsViewHolder(view: View):RecyclerView.ViewHolder(view){
    private val categoria = view.findViewById<TextView>(R.id.cardinfo_titulo_cabecalho)
    private val publicitario = view.findViewById<RecyclerView>(R.id.cardinfo_recycler_elemento_unitario)

    fun personalizarElementos(elementoLista: Publicidade) {
        categoria.text = elementoLista.nome
        publicitario.adapter = CardInfoRecyclerPublicidadeAdapter(elementoLista.listaPublicitarios)
    }

}