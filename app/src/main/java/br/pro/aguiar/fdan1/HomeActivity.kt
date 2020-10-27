package br.pro.aguiar.fdan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.i("CicloDeVida", "HomeActivity onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("CicloDeVida", "HomeActivity onStart")
    }       // Vai para onResume
    override fun onResume() {
        super.onResume()
        Log.i("CicloDeVida", "HomeActivity onResume")
    }       // Activity Ativa
    override fun onPause() {
        super.onPause()
        Log.i("CicloDeVida", "HomeActivity onPause")
    }       // Volta para o onResume
    override fun onStop() {
        super.onStop()
        Log.i("CicloDeVida", "HomeActivity onStop")
    }           // Vai para o onRestart
    override fun onRestart() {
        super.onRestart()
        Log.i("CicloDeVida", "HomeActivity onRestart")
    }       // Volta para o onStart
    override fun onDestroy() {
        super.onDestroy()
        Log.i("CicloDeVida", "HomeActivity onDestroy")
    }
}