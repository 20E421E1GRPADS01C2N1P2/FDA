package br.pro.aguiar.fdan1.model

import android.util.Log

class Usuario (
    var nome: String,
    var email: String,
    var senha: String
) {
    fun store(){
        Log.i("Usuário",
            "$nome ($email) persistido com sucesso!")
    }
}