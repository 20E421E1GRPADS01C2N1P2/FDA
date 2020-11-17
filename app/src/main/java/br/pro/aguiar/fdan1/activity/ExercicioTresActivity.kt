package br.pro.aguiar.fdan1.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.pro.aguiar.fdan1.R
import kotlinx.android.synthetic.main.activity_exercicio_tres.*

class ExercicioTresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio_tres)
        btnE3Acessar.setOnClickListener {
            var homeLivroIntent = Intent(
                this,
                HomeLivroActivity::class.java
            )
            startActivity(homeLivroIntent)
        }
    }
}