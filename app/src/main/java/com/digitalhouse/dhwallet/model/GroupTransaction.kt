package com.digitalhouse.dhwallet.model

class GroupTransaction(
    val transactionType:GroupTransactionType,
    val transactionTitle:String,
    val transactionSubtitle:String? = null,
    val transactionValue:String? = null,
    val transactionImage:String? = null
)
enum class GroupTransactionType{
    CABECALHO,
    TRANSACAO
}