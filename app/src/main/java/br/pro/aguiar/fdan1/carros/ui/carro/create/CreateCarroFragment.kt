package br.pro.aguiar.fdan1.carros.ui.carro.create

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import br.pro.aguiar.fdan1.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.create_carro_fragment.*

class CreateCarroFragment : Fragment() {

    private lateinit var createCarroViewModel: CreateCarroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.create_carro_fragment, container, false)

        createCarroViewModel = ViewModelProvider(this).get(CreateCarroViewModel::class.java)

        createCarroViewModel.let {
            it.msg
                .observe(viewLifecycleOwner) {
                    if (!it.isNullOrBlank())
                        showSnackbar(it)
                }
            it.status
                .observe(viewLifecycleOwner) { status ->
                    if (status)
                        findNavController().popBackStack()
                }
        }

        return view
    }

    private fun showSnackbar(msg: String) {
        Snackbar
            .make(
                create_carro_layout_root,
                msg,
                Snackbar.LENGTH_LONG
            )
            .show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabCadastroCarroSalvar.setOnClickListener {

            val marca = editTextCadastroCarroMarca.text.toString()
            val modelo = editTextCadastroCarroModelo.text.toString()
            val placa = editTextCadastroCarroPlaca.text.toString()
            val preco = editTextCadastroCarroPreco.text.toString()

            createCarroViewModel.store(
                marca, modelo, placa, preco
            )

        }
    }

}