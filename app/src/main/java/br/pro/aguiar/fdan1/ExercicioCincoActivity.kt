package br.pro.aguiar.fdan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercicio_cinco.*

class ExercicioCincoActivity : AppCompatActivity() {

    var quantidadeCarrinho = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio_cinco)

        textViewCarrinhoCompras.text = quantidadeCarrinho.toString()

        btnCarrinhoAdd.setOnClickListener {
            quantidadeCarrinho++
            textViewCarrinhoCompras.text = quantidadeCarrinho.toString()
        }

        btnCarrinhoSub.setOnClickListener {
            quantidadeCarrinho--
            textViewCarrinhoCompras.text = quantidadeCarrinho.toString()
        }

    }
}