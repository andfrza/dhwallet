package com.digitalhouse.dhwallet.appLists

import com.digitalhouse.dhwallet.HomeCartao
import com.digitalhouse.dhwallet.R

class Cartoes {
    fun listaDeCartoes():MutableList<HomeCartao>{
        return mutableListOf(
            HomeCartao.newInstance("R$ 1234,23", R.drawable.ic_visa,"123","JOAQUIM SILVA","10/24",R.drawable.background_card_green),
            HomeCartao.newInstance("R$ 126,58", R.drawable.ic_visa,"487","FERNANDA LIMA","11/23",R.drawable.background_card_violet),
            HomeCartao.newInstance("R$ 564,50", R.drawable.ic_visa,"558","JOSÉ ANDRADE","06/22",R.drawable.background_card_yellow)
        )
    }
}