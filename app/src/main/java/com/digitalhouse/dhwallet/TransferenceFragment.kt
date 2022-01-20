package com.digitalhouse.dhwallet

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.ContactAdapter
import com.digitalhouse.dhwallet.model.Contact
import com.digitalhouse.dhwallet.model.ContactType

class TransferenceFragment : Fragment(R.layout.transference_fragment) {

    //Permissão:
    private val permissionsResultCallback = registerForActivityResult(ActivityResultContracts.RequestPermission()){
        if(it){
            println("Permission has been granted by user.")
        }else{
            Toast.makeText(requireContext(),"Permission denied.",Toast.LENGTH_LONG).show()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listContact = MutableList<Contact>(10){
            Contact(
                image = "https://conteudo.imguol.com.br/blogs/174/files/2018/05/iStock-648229868-1024x909.jpg",
                name = "Leslee",
                type = ContactType.IRMA
            )
        }

        //RecyclerView:
        val recycler = view.findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = ContactAdapter(listContact)

        //Botão de leitura código QR:
//        val botaoQR = view.findViewById<Button>(R.id.transference_botao_leitorQR)
//        botaoQR.setOnClickListener {
//            val permission = ContextCompat.checkSelfPermission(it.context, Manifest.permission.CAMERA)
//            if(permission != PackageManager.PERMISSION_GRANTED){
//                //Se o usuário não concedeu a permissão, exibe o pop-up de permissão:
//                permissionsResultCallback.launch(Manifest.permission.CAMERA)
//            }else{println("Permission isGranted")}
//        }

        /**
         *Como são instruções padrão, posso inserir no arquivo de layout como
         *app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager", substituindo:
         *recycler.layoutManager = LinearLayoutManager(view.context,LinearLayoutManager.VERTICAL,false)
         */

    }
}