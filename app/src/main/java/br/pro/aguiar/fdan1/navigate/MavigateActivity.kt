package br.pro.aguiar.fdan1.navigate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import br.pro.aguiar.fdan1.R
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