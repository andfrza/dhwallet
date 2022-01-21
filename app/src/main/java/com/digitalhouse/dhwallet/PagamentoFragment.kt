package com.digitalhouse.dhwallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.ContactAdapter
import com.digitalhouse.dhwallet.adapter.PagamentoAdapter
import com.digitalhouse.dhwallet.model.Contact
import com.digitalhouse.dhwallet.model.PagamentosFavoritos

class PagamentoFragment : Fragment() {

    val lista = MutableList(10){
        PagamentosFavoritos(
            image = "https://www.copel.com/site/wp-content/uploads/2021/12/logo-copel-avatar.jpg",
            name ="Copel",
            description = "R. Prof. Brasílio Ovídio da Costa, 1703"
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pagamento_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycler = view.findViewById<RecyclerView>(R.id.pagamento_recycler)
        recycler.adapter = PagamentoAdapter(lista)
    }
}