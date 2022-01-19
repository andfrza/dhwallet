package com.digitalhouse.dhwallet.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.digitalhouse.dhwallet.R
import com.digitalhouse.dhwallet.model.GroupTransaction
import com.digitalhouse.dhwallet.model.GroupTransactionType

private const val HEADER = 0
private const val CONTENT = 1

class TransactionAdapter(private val listaDeTransacoes:List<GroupTransaction>): RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    //Sob qual molde o Adapter deve criar as views do recycler, a depender de uma categoria de viewType (0 ou 1 no caso, pode mudar):
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        if(viewType == HEADER){
            return TransactionHeaderViewHolder(inflater.inflate(R.layout.transaction_cabecalho_data,parent,false))
        }
        return TransactionViewHolder(inflater.inflate(R.layout.transaction_transacao_completa,parent,false))
    }

    //Com a view definida, o que ele deve personalizar no layout inflado:
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is TransactionHeaderViewHolder -> holder.cabecalhoTransaction(listaDeTransacoes[position].transactionTitle)
            is TransactionViewHolder -> holder.atribuirElementos(listaDeTransacoes[position])
        }
    }

    //Número de itens no recycler:
    override fun getItemCount(): Int {
        return listaDeTransacoes.size
    }

    //Define as categorias de viewType utilizadas no onCreateViewHolder:
    override fun getItemViewType(position: Int): Int {
        if(listaDeTransacoes[position].transactionType == GroupTransactionType.CABECALHO){
            return HEADER
        }
        return CONTENT
    }
}

//Moldes para o recycler:
class TransactionHeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val title: TextView = view.findViewById(R.id.transaction_header_title)
    private val imageArrow: ImageView = view.findViewById(R.id.transaction_arrow)

    fun cabecalhoTransaction(transactionHeaderTitle:String){
        title.text = transactionHeaderTitle
    }
}

class TransactionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val image: ImageView = view.findViewById(R.id.image)
    private val title: TextView = view.findViewById(R.id.item_transaction_title)
    private val subtitle: TextView = view.findViewById(R.id.item_transaction_subtitle)
    private val value: TextView = view.findViewById(R.id.item_transaction_value)

    fun atribuirElementos(item: GroupTransaction){
        Glide.with(image.context).load(item.transactionImage).circleCrop().into(image)
        title.text = item.transactionTitle
        subtitle.text = item.transactionSubtitle
        value.text = item.transactionValue
        if(subtitle.text=="Pagamento"){
            value.setTextColor(Color.parseColor("#FFFB6969"))
        }else{value.setTextColor(Color.parseColor("#FF45C232"))}

    }
}