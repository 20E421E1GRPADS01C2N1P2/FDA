package br.pro.aguiar.fdan1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.pro.aguiar.fdan1.navigate.MavigateActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExercicio1.setOnClickListener {

            var nomeUsuario = editTextUsuarioNome.text.toString()

            var alterActivity = Intent(
                this,
                HomeActivity::class.java)

            alterActivity.putExtra("userAge", 60)
            alterActivity.putExtra("userName", nomeUsuario)

            startActivity(alterActivity)
        }
        btnExercicio2.setOnClickListener {
            // ExercicioDoisActivity
            var intent = Intent(
                this,
                ExercicioDoisActivity::class.java)
            startActivity(intent)
        }

        btnExercicio3.setOnClickListener {
            var exc3Intent = Intent(
                this, ExercicioTresActivity::class.java
            )
            startActivity(exc3Intent)
        }

        btnExercicio4.setOnClickListener {
            var exc4Intent = Intent(
                this, MavigateActivity::class.java
            )
            startActivity(exc4Intent)
        }

        btnExercicio5.setOnClickListener {
            startActivity(
                Intent(
                    this, ExercicioCincoActivity::class.java
                )
            )
        }
    }

}