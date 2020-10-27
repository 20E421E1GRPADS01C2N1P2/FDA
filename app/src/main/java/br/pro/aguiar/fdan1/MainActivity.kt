package br.pro.aguiar.fdan1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

//import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLancarD4.setOnClickListener {
            lancarDado(4)
        }
        btnLancarD6.setOnClickListener {
            lancarDado(6)
        }
        btnLancarD10.setOnClickListener {
            lancarDado(10)
        }
        btnLancarD20.setOnClickListener {
            lancarDado(20)
        }
    }

    private fun lancarDado(dado: Int) {
        var valorDado = Random().nextInt(dado) + 1 // [1 .. 7[
        textViewValorDado.text = "$valorDado"
    }

    /*
    fun goToHomeActivity(){
        // Intent
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }


//    override fun onStart() {
//        super.onStart()
//        Log.i("CicloDeVida", "MainActivity onStart")
//    }       // Vai para onResume
//    override fun onResume() {
//        super.onResume()
//        Log.i("CicloDeVida", "MainActivity onResume")
//    }       // Activity Ativa
//    override fun onPause() {
//        super.onPause()
//        Log.i("CicloDeVida", "MainActivity onPause")
//    }       // Volta para o onResume
//    override fun onStop() {
//        super.onStop()
//        Log.i("CicloDeVida", "MainActivity onStop")
//    }           // Vai para o onRestart
//    override fun onRestart() {
//        super.onRestart()
//        Log.i("CicloDeVida", "MainActivity onRestart")
//    }       // Volta para o onStart
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.i("CicloDeVida", "MainActivity onDestroy")
//    }
     */
}