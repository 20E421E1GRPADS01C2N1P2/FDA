package br.pro.aguiar.fdan1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun actionLancarDado(it: View) {// Java -> Void | Kotlin -> Unit
        when (it.id) {
            R.id.btnLancarD4 -> lancarDado(4)
            R.id.btnLancarD6 -> lancarDado(6)
            R.id.btnLancarD10 -> lancarDado(10)
            R.id.btnLancarD20 -> lancarDado(20)
        }
    }

    private fun lancarDado(dado: Int) {
        var valorDado = Random().nextInt(dado) + 1 // [1 .. 7[
        textViewValorDado.text = "$valorDado"
        textViewHistoricoLancamento.text =
            "D$dado:\t\t$valorDado\n" + textViewHistoricoLancamento.text.toString()
    }
}