package br.pro.aguiar.fdan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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