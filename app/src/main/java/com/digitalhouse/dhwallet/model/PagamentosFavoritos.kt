package com.digitalhouse.dhwallet.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class PagamentosFavoritos(
    val image: String,
    val name: String,
    val description: String
) : Parcelable
