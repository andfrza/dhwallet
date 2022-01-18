package com.digitalhouse.dhwallet

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class HomeCartao(val nomeCartao:String, val limiteCartao:String,
val numeroCartao:String, val validadeCartao:String, val corCartao:String) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_cartao, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nome = view.findViewById<TextView>(R.id.nome_nome)
        val limite = view.findViewById<TextView>(R.id.limite_valor)
        val numero = view.findViewById<TextView>(R.id.numero_cartao_texto_4)
        val validade = view.findViewById<TextView>(R.id.validade_valor)
        val card = view.findViewById<CardView>(R.id.cardview_cartao)
        val bandeira = view.findViewById<ImageView>(R.id.bandeira)

        //Alterar textos de cada cartão:
        nome.text = nomeCartao
        limite.text = limiteCartao
        numero.text = numeroCartao
        validade.text = validadeCartao

        //Personalizar as cores e as bandeiras de cada cartão:
        card.setCardBackgroundColor(Color.parseColor("#FF45C232"))
        bandeira.setImageResource(R.drawable.ic_visa)

    }
}