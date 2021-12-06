package com.rafael.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton_Jogar.setOnClickListener {
            var intent = Intent(applicationContext, ResultadoActivity::class.java)

            var numero = Random.nextInt(0,2)  //////////// começo e fim (final "2" não conta)

            intent.putExtra("imagem",numero)

            startActivity(intent)
        }




    }
}


