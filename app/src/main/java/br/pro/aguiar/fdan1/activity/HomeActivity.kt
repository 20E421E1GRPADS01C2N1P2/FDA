package br.pro.aguiar.fdan1.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.pro.aguiar.fdan1.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.i("CicloDeVida", "HomeActivity onCreate")


//        var usuarioNome = intent.getStringExtra("userName")
//        var usuarioIdade = intent.getIntExtra("userAge", 18)
//
//        Toast.makeText(
//            this,
//            "Olá $usuarioNome",
//            Toast.LENGTH_LONG
//        ).show()
    }


//    fun actionLancarDado(it: View) {// Java -> Void | Kotlin -> Unit
//        when (it.id) {
//            R.id.btnLancarD4 -> lancarDado(4)
//            R.id.btnLancarD6 -> lancarDado(6)
//            R.id.btnLancarD10 -> lancarDado(10)
//            R.id.btnLancarD20 -> lancarDado(20)
//        }
//    }
//    private fun lancarDado(dado: Int) {
//        var valorDado = Random().nextInt(dado) + 1 // [1 .. 7[
//        textViewValorDado.text = "$valorDado"
//        textViewHistoricoLancamento.text =
//            "D$dado:\t\t$valorDado\n" + textViewHistoricoLancamento.text.toString()
//    }
}