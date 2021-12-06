package com.example.passandodadosentreactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_PassarDados.setOnClickListener {
            val intent = Intent(applicationContext, segundaActivity::class.java)

            intent.putExtra("nome", "Rafael") //// colocar variaveis para exportar antes de iniciar a tela
            intent.putExtra("telefone", 988342949)
            intent.putExtra("idade", 29)
            intent.putExtra("Endereço", "Rua São Jorge, 293 - ap. 4, bairro: Pae Cara")

            startActivity(intent)










        }
    }
}