package br.pro.aguiar.fdan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_mavigate.*

class MavigateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mavigate)

        bottomNavigationMain
            .setupWithNavController(
                findNavController(R.id.navHostFragment)
            )

    }
}