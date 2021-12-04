package com.digitalhouse.dhwallet

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.ContactAdapter
import com.digitalhouse.dhwallet.model.Contact
import com.digitalhouse.dhwallet.model.ContactType

class TransferFragment : Fragment(R.layout.fragment_transfer) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listContact = MutableList<Contact>(10){
            Contact(
                image = "https://conteudo.imguol.com.br/blogs/174/files/2018/05/iStock-648229868-1024x909.jpg",
                name = "Leslee",
                type = ContactType.IRMA
            )
        }
        val recycler = view.findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = ContactAdapter(listContact)

        /**
        *Como são instruções padrão, posso inserir no arquivo de layout como
        *app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager", substituindo:
        *recycler.layoutManager = LinearLayoutManager(view.context,LinearLayoutManager.VERTICAL,false)
        */

    }
}