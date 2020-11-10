package br.pro.aguiar.fdan1.ui.profile

import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdan1.model.Usuario

class ProfileViewModel : ViewModel() {

    fun salvarUsuario(
        nome: String,
        email: String,
        senha: String
    ): Boolean {
        var usuario = Usuario(nome, email, senha)
        usuario.store()
        return true
    }


}