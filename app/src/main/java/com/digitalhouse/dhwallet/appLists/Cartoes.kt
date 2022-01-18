package com.digitalhouse.dhwallet.appLists

import com.digitalhouse.dhwallet.HomeCartao

class Cartoes {
    fun listaDeCartoes():MutableList<HomeCartao>{
        return mutableListOf(
            HomeCartao(
                "Joaquim",
                "R$ 1002,56",
                "123",
                "10/22",
                "#FF45C232<"),
            HomeCartao(
                "Fernanda",
                "R$ 1569,25",
                "456",
                "09/22",
                "#FF444BB1")
        )
    }
}