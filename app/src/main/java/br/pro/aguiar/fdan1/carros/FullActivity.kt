package br.pro.aguiar.fdan1.carros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.fdan1.R

class FullActivity : AppCompatActivity() {

    val nome: String? = null
    var questao1: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full)
    }
}