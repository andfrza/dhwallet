package com.digitalhouse.dhwallet

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.TransactionAdapter
import com.digitalhouse.dhwallet.element.TransactionsRealizadas
import com.digitalhouse.dhwallet.model.GroupTransaction


private const val ARG_ENTRADA = "arg_entrada"
private const val ARG_SAIDA = "arg_saida"

class TransactionFragment : Fragment(R.layout.transaction_fragment), TransactionAdapter.OnClickListener{
    // TODO: Rename and change types of parameters
    private var entrada: String? = null
    private var saida: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            entrada = it.getString(ARG_ENTRADA)
            saida = it.getString(ARG_SAIDA)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycler = view.findViewById<RecyclerView>(R.id.recyclerTransaction)
        val view = view.findViewById<ImageView>(R.id.botao_transferir)
        val transactionsRealizadas = TransactionsRealizadas()
        val lista = transactionsRealizadas.listagemDeTransacoesRealizadas()
        recycler.adapter = TransactionAdapter(lista,this)

        /**
         * Inflar o fragmento atual com outro tipo de fragmento
         */
        view.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .addToBackStack(TransactionFragment::class.java.name)
                .replace(R.id.fragment_container,TransferFragment())
                .commit()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.transaction_fragment, container, false)
    }

    companion object {
        fun newInstance(paramEntrada: String, paramSaida: String) =
            TransactionFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_ENTRADA, paramEntrada)
                    putString(ARG_SAIDA, paramSaida)
                }
            }
    }

    override fun cliqueDoItem(transaction: GroupTransaction) {
        val toast = Toast.makeText(context,transaction.transactionTitle, Toast.LENGTH_LONG)
        toast.show()
    }
}