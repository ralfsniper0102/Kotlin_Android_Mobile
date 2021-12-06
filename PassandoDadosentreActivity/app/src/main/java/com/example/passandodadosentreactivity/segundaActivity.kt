package com.example.passandodadosentreactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_segunda.*

class segundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var dados: Bundle? = intent.extras ///////busca os dados exportados
        var nome = dados?.getString("nome") ////// busca em dados e envia para uma variável local
        var idade = dados?.getInt("idade")

        textView_Nome.text=nome // imprime na tela
        textView_Idade.text = idade.toString()

    }
}