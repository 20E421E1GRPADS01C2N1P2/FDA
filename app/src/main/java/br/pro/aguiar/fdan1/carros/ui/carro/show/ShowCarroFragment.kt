package br.pro.aguiar.fdan1.carros.ui.carro.show

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdan1.R
import br.pro.aguiar.fdan1.carros.FullViewModel
import br.pro.aguiar.fdan1.carros.model.Carro
import kotlinx.android.synthetic.main.show_carro_fragment.*

class ShowCarroFragment : Fragment() {

//    private lateinit var viewModel: ShowCarroViewModel
    private lateinit var fullViewModel: FullViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.show_carro_fragment, container, false)

        fullViewModel =
            ViewModelProvider(requireActivity())
                .get(FullViewModel::class.java)

        fullViewModel
            .carro
            .observe(viewLifecycleOwner) {
                updateUI(it)
            }

        return view
    }

    private fun updateUI(carro: Carro) {
        textViewShowCarroMarca.text = carro.marca
        textViewShowCarroModelo.text = carro.modelo
        textViewShowCarroPlaca.text = carro.placa
        textViewShowCarroValor.text = carro.preco.toString()
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(ShowCarroViewModel::class.java)
//    }

}