package br.pro.aguiar.fdan1.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdan1.R
import br.pro.aguiar.fdan1.model.Usuario
import br.pro.aguiar.fdan1.ui.dashboard.DashboardViewModelFactory
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        profileViewModel = ViewModelProvider(this, DashboardViewModelFactory())
                                .get(ProfileViewModel::class.java)

        btnPerfilCadastrar.setOnClickListener {
            var nome = editTextPerfilNome.text.toString()
            var email = editTextPerfilEmail.text.toString()
            var senha = editTextPerfilSenha.text.toString()
            var reSenha = editTextPerfilReSenha.text.toString()

            if (senha.compareTo(reSenha) == 0 ) {
                profileViewModel.salvarUsuario(nome, email, senha)
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