package com.rafael.estaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed( //////////// executa uma oura tela
            {////////////////// expressão lambda para abrir a outra activity
            val mintent = Intent(applicationContext, MainActivity::class.java) ////// recebe o caminho da outra activity
            startActivity(mintent) ////////////// abre a activity que esta em mintent
            finish()////////////// finaliza a tela Splash
            },
        1500////////// determina em quanto tempo a tela Splash fica aberta até ser fechada
        )
    }
}