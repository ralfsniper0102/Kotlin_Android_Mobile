package com.example.atmconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "1. onCreate", Toast.LENGTH_SHORT).show() /////////////onCreate

        button_aEmpresa.setOnClickListener {
            Toast.makeText(applicationContext,"a Empresa", Toast.LENGTH_SHORT).show()

            val intent = Intent(applicationContext, aEmpresa::class.java)
            startActivity(intent)
        }
        button_clientes.setOnClickListener {
            Toast.makeText(applicationContext, "Clientes", Toast.LENGTH_SHORT).show()

            val intent = Intent(applicationContext, Clientes::class.java)
            startActivity(intent)
        }
        button_contato.setOnClickListener {
            Toast.makeText(applicationContext, "Contato", Toast.LENGTH_SHORT).show()

            val intent = Intent(applicationContext, Contato::class.java)
            startActivity(intent)
        }
        button_servicos.setOnClickListener {
            Toast.makeText(applicationContext, "Serviços", Toast.LENGTH_SHORT).show()

            val intent = Intent(applicationContext, Servicos::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(applicationContext, "2. onStart", Toast.LENGTH_SHORT).show() /////////////onStart
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(applicationContext, "3. onResume", Toast.LENGTH_SHORT).show() /////////////onResume
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(applicationContext, "4. onPause", Toast.LENGTH_SHORT).show() /////////////onPause
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(applicationContext, "5. onStop", Toast.LENGTH_SHORT).show() /////////////onStop
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(applicationContext, "6. onRestart", Toast.LENGTH_SHORT).show() /////////////onRestart
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(applicationContext, "7. onDestroy", Toast.LENGTH_SHORT).show() /////////////onDestroy
    }
}