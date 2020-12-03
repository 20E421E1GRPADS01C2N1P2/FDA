package br.pro.aguiar.parimpar.model

import kotlin.random.Random

class Jogo (
    var nomeJogador: String
) {
    // Jogador ganha se der par
    // Maquina ganha se der impar

    companion object {
        fun verificarResultado(opcaoJogador: Int, opcaoMaquina: Int)
                = opcaoJogador == opcaoMaquina

        fun pegarOpcaoMaquina()
                = Random.nextInt(2)
    }

}