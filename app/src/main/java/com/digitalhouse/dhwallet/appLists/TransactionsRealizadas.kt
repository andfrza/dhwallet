package com.digitalhouse.dhwallet.appLists

import com.digitalhouse.dhwallet.model.GroupTransaction
import com.digitalhouse.dhwallet.model.GroupTransactionType

class TransactionsRealizadas{
    fun listagemDeTransacoesRealizadas():MutableList<GroupTransaction>{
        return mutableListOf(
            GroupTransaction(
                transactionType = GroupTransactionType.CABECALHO,
                transactionTitle = "Hoje"
            ),
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
                transactionType = GroupTransactionType.CABECALHO,
                transactionTitle = "Qua., 10 de nov."
            ),
            GroupTransaction(
                transactionType = GroupTransactionType.TRANSACAO ,
                transactionTitle = "Dribble Inc.",
                transactionSubtitle = "Recebimento",
                transactionValue = "+ R$ 45",
                transactionImage ="https://www.nicepng.com/png/detail/21-215268_dribbble-twitter-dribbble-logo.png"
            ),
            GroupTransaction(
                transactionType = GroupTransactionType.TRANSACAO ,
                transactionTitle = "Dribble Inc.",
                transactionSubtitle = "Recebimento",
                transactionValue = "+ R$ 45",
                transactionImage ="https://www.nicepng.com/png/detail/21-215268_dribbble-twitter-dribbble-logo.png"
            )
        )
    }
}