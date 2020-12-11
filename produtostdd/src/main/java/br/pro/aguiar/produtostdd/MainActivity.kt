package br.pro.aguiar.produtostdd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEmail = findViewById<EditText>(R.id.editTextTextPersonName)
        val editTextPassword = findViewById<EditText>(R.id.editTextTextPassword)
        val btnLoginAcessar = findViewById<Button>(R.id.btnLoginAcessar)

        btnLoginAcessar.setOnClickListener {

            val email = editTextEmail.text.toString()
            val senha = editTextPassword.text.toString()
            val autenticacao = verificarAutenticacao(email, senha)

            if (autenticacao == true){
                startActivity(
                    Intent(this, DashboardActivity::class.java)
                )
            } else if (autenticacao == false)
                showSnackbar("Usuário ou Senha inválido!")
            else
                showSnackbar("Preencha todos os campos!")
        }
    }

    private fun verificarAutenticacao(email: String, senha: String): Boolean? {
        if (!email.isNullOrBlank() && !senha.isNullOrBlank())
            return (
                email.compareTo("thi@go.com") == 0 &&
                        senha.compareTo("123456") == 0)
        else
            return null
    }

    private fun showSnackbar(msg: String) {
        Snackbar.make(
            findViewById(R.id.root_main_layout),
            msg, Snackbar.LENGTH_LONG
        ).show()
    }
}

