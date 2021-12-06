package com.rafael.caraoucoroa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var dados: Bundle? = this.intent.extras

        var imagem = dados?.getInt("imagem")

        if (imagem== 0) {
            image_resultado.setImageResource(R.drawable.moeda_coroa)  /////////////// trocar imagem
        }
        else if ( imagem == 1){
            image_resultado.setImageResource(R.drawable.moeda_cara)
        }
        else{
            image_resultado.setImageResource(R.drawable.logo)
        }


        imageButton_Voltar.setOnClickListener {
            finish()
        }
    }
}

