package br.pro.aguiar.fdan1.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import br.pro.aguiar.fdan1.R
import br.pro.aguiar.fdan1.model.Usuario

class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnPerfilCadastrar.setOnClickListener {
            var nome = editTextPerfilNome.text.toString()
            var email = editTextPerfilEmail.text.toString()
            var senha = editTextPerfilSenha.text.toString()
            var reSenha = editTextPerfilReSenha.text.toString()

            if (senha.compareTo(reSenha) == 0 ) {
                var usuario = Usuario(nome, email, senha)
                usuario.store()
            } else {
                Toast.makeText(
                    requireContext(),
                    "Senhas não conferem!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }


    }

}