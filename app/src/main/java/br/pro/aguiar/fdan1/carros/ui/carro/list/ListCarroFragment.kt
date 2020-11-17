package br.pro.aguiar.fdan1.carros.ui.carro.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdan1.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.list_carro_fragment.*

class ListCarroFragment : Fragment() {

    private lateinit var listCarroViewModel: ListCarroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.list_carro_fragment, container, false)
        listCarroViewModel =
            ViewModelProvider(this)
                .get(ListCarroViewModel::class.java)

        listCarroViewModel
            .status
            .observe(viewLifecycleOwner) {
                //if (it)
                    // finalizar o progressBar
            }

        listCarroViewModel
            .msg
            .observe(viewLifecycleOwner) {
                Snackbar.make(
                    list_carro_layout_root,
                    it,
                    Snackbar.LENGTH_LONG
                ).show()
            }

        listCarroViewModel
            .carros
            .observe(viewLifecycleOwner) { carros ->
                listViewCarros
                    .adapter = ArrayAdapter(
                    requireContext(),
                    android.R.layout.simple_list_item_1,
                    carros
                )
            }

        return view
    }

}