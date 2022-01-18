package com.digitalhouse.dhwallet.appLists

import com.digitalhouse.dhwallet.model.GroupTransaction
import com.digitalhouse.dhwallet.model.GroupTransactionType

class TransactionsHome{
    fun listagemDeTransacoesHome():MutableList<GroupTransaction>{
        return mutableListOf(
            GroupTransaction(
                transactionType = GroupTransactionType.TRANSACAO ,
                transactionTitle = "Dribble Inc.",
                transactionSubtitle = "Recebimento",
                transactionValue = "+ R$ 45",
                transactionImage ="https://www.nicepng.com/png/detail/21-215268_dribbble-twitter-dribbble-logo.png"
            ),
            GroupTransaction(
                transactionType = GroupTransactionType.TRANSACAO ,
                transactionTitle = "Spotify Family",
                transactionSubtitle = "Pagamento",
                transactionValue = "- R$ 163",
                transactionImage ="https://assets.turbologo.com/blog/en/2021/07/20045641/Spotify_logo_symbol.png"
            ),
            GroupTransaction(
                transactionType = GroupTransactionType.TRANSACAO ,
                transactionTitle = "Netflix",
                transactionSubtitle = "Pagamento",
                transactionValue = "- R$ 15",
                transactionImage ="https://assets.brand.microsites.netflix.io/assets/2800a67c-4252-11ec-a9ce-066b49664af6_cm_800w.jpg?v=4"
            ),
            GroupTransaction(
                transactionType = GroupTransactionType.TRANSACAO ,
                transactionTitle = "Uber Inc.",
                transactionSubtitle = "Pagamento",
                transactionValue = "- R$ 35",
                transactionImage ="https://logodownload.org/wp-content/uploads/2015/05/uber-logo-5-1.png"
            )
        )
    }
}