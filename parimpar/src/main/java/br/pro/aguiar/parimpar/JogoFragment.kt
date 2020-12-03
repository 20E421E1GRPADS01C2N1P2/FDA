package br.pro.aguiar.parimpar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.parimpar.viewmodel.AppViewModel
import kotlinx.android.synthetic.main.fragment_jogo.*

class JogoFragment : Fragment() {

    private lateinit var appViewModel: AppViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        appViewModel =
            ViewModelProvider(requireActivity())
                .get(AppViewModel::class.java)

        appViewModel.let {
            it.jogo.observe(viewLifecycleOwner) {
                textViewJogoNomeJogador.text = it.nomeJogador
            }
            it.opcaoJogador.observe(viewLifecycleOwner) {
                    if (!it.isNullOrBlank())
                        textViewJogoOpcaoJogador.text = it
                }
            it.opcaoMaquina.observe(viewLifecycleOwner) {
                    if (!it.isNullOrBlank())
                        textViewJogoOpcaoMaquina.text = it
                }
            it.resultado.observe(viewLifecycleOwner) {
                if (!it.isNullOrBlank())
                    textViewJogoResultado.text = it
            }
        }
        return inflater.inflate(R.layout.fragment_jogo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imgViewOpcaoImpar.setOnClickListener(this::selecionarOpcao)
        imgViewOpcaoPar.setOnClickListener(this::selecionarOpcao)
    }

    fun selecionarOpcao(view: View){
        val opcao =
            if (view.id == R.id.imgViewOpcaoPar) 0
            else 1
        appViewModel.realizarJogada(opcao)
    }

}