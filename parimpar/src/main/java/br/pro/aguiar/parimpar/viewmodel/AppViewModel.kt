package br.pro.aguiar.parimpar.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.parimpar.model.Jogo

class AppViewModel : ViewModel() {
    private val _jogo = MutableLiveData<Jogo>()
    private val _opcaoJogador = MutableLiveData<String>()
    private val _opcaoMaquina = MutableLiveData<String>()
    private val _resultado = MutableLiveData<String>()

    val jogo: LiveData<Jogo> = _jogo
    val opcaoJogador: LiveData<String> = _opcaoJogador
    val opcaoMaquina: LiveData<String> = _opcaoMaquina
    val resultado: LiveData<String> = _resultado

    fun iniciarJogo(nomeJogador: String) {
        _jogo.value = Jogo(nomeJogador)
    }

    fun realizarJogada(opcao: Int) {
        _opcaoJogador.value =
            if (opcao == 0)
                "Par"
            else "Ímpar"

        val opcaoMaquina = Jogo.pegarOpcaoMaquina()
        _opcaoMaquina.value =
            if (opcaoMaquina == 0) "Par"
            else "Ímpar"

        _resultado.value =
            if (Jogo.verificarResultado(opcao, opcaoMaquina)) "Ganhou"
            else "Perdeu"
    }

}
