package br.pro.aguiar.fdan1.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.pro.aguiar.fdan1.R
import kotlinx.android.synthetic.main.activity_exercicio_cinco.*

class ExercicioCincoActivity : AppCompatActivity() {

    var quantidadeCarrinho = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio_cinco)

        textViewCarQuantidadeCompras.text = quantidadeCarrinho.toString()

        btnCarrinhoAdd.setOnClickListener {
            quantidadeCarrinho++
            textViewCarQuantidadeCompras.text = quantidadeCarrinho.toString()
        }

        btnCarrinhoSub.setOnClickListener {
            quantidadeCarrinho--
            textViewCarQuantidadeCompras.text = quantidadeCarrinho.toString()
        }

    }
}