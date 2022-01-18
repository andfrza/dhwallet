package com.digitalhouse.dhwallet.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class GroupTransaction(
    val transactionType:GroupTransactionType,
    val transactionTitle:String,
    val transactionSubtitle:String? = null,
    val transactionValue:String? = null,
    val transactionImage:String? = null
): Parcelable
enum class GroupTransactionType{
    CABECALHO,
    TRANSACAO
}