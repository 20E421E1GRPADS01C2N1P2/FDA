package br.pro.aguiar.fdan1.ui.outros

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import br.pro.aguiar.fdan1.R
import br.pro.aguiar.fdan1.model.Livro
import kotlinx.android.synthetic.main.fragment_l_ista_livros.*

class LIstaLivrosFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_l_ista_livros,
            container,
            false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var livros = listOf(
            Livro(
                "Android com Kotlin",
                "Dominando as técnicas Avançadas",
                "João Lira",
                400
            ),
            Livro(
                "Android com Java",
                "Dominando as técnicas Avançadas",
                "Marcos Lira",
                0
            ),
            Livro(
                "Android com Flutter",
                "Dominando as técnicas Avançadas",
                "Joana Garcia",
                0
            )
        )
        listViewLivros.adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            livros
        )
    }

}