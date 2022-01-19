package com.digitalhouse.dhwallet

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

private const val ARG_LIMITE = "arg_limite"
private const val ARG_BANDEIRA = "arg_bandeira"
private const val ARG_NUMERO = "arg_numero"
private const val ARG_NOME = "arg_nome"
private const val ARG_VALIDADE = "arg_validade"
private const val ARG_COR = "arg_cor"

class HomeCartao() : Fragment() {

    private var nomeCartao:String? = null
    private var limiteCartao:String? = null
    private var numeroCartao:String? = null
    private var validadeCartao:String? = null
    private var corCartao:Int? = null
    private var bandeiraCartao:Int? = null

    companion object{
        fun newInstance(limiteCartao:String, @DrawableRes bandeiraCartao:Int, numeroCartao:String,
                        nomeCartao:String, validadeCartao:String, @DrawableRes corCartao:Int)=
            HomeCartao().apply {
                arguments = Bundle().apply {
                    putString(ARG_LIMITE,limiteCartao)
                    putInt(ARG_BANDEIRA,bandeiraCartao)
                    putString(ARG_NUMERO,numeroCartao)
                    putString(ARG_NOME,nomeCartao)
                    putString(ARG_VALIDADE,validadeCartao)
                    putInt(ARG_COR,corCartao)
                }
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let{
            limiteCartao = it.getString(ARG_LIMITE)
            bandeiraCartao = it.getInt(ARG_BANDEIRA)
            nomeCartao = it.getString(ARG_NOME)
            numeroCartao = it.getString(ARG_NUMERO)
            validadeCartao = it.getString(ARG_VALIDADE)
            corCartao = it.getInt(ARG_COR)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_cartao, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nomeView = view.findViewById<TextView>(R.id.nome_nome)
        val limiteView = view.findViewById<TextView>(R.id.limite_valor)
        val numeroView = view.findViewById<TextView>(R.id.numero_cartao_texto_4)
        val validadeView = view.findViewById<TextView>(R.id.validade_valor)
        val cardView = view.findViewById<CardView>(R.id.cardview_cartao)
        val bandeiraView = view.findViewById<ImageView>(R.id.bandeira)

        //Alterar elementos de cada cartão:
        limiteCartao?.let{limiteView.text = it}
        bandeiraCartao?.let{bandeiraView.setImageResource(it)}
        numeroCartao?.let{numeroView.text = it}
        nomeCartao?.let{nomeView.text = it}
        validadeCartao?.let{validadeView.text = it}
        corCartao?.let { cardView.setBackgroundResource(it)}

    }
}