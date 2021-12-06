package com.example.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
    fun Calcular(view: View){
        var textoAlcool = editTextAlcool.text.toString()
        var textoGasolina = editTextGasolina.text.toString()

        if(textoAlcool == null || /////////////////////////////////////validação feita após a intanciação
            textoAlcool.equals("") || textoGasolina == null ||
            textoGasolina.equals("")){

                textViewResultado.text = "Preencha os campos"

        }
        else {

            var valorAlcool: Double = textoAlcool.toString().toDouble() /////////////////primeiro passar para string e depois para double
            var valorGasolina: Double = textoGasolina.toString().toDouble()


            when {
                valorAlcool > valorGasolina -> {
                    textViewResultado.text = "Gasolina"
                }
                valorAlcool < valorGasolina -> {
                    textViewResultado.text = "Alcool"
                }
                valorAlcool == valorGasolina -> {
                    textViewResultado.text = "Ambos estão com o mesmo preço"
                }
            }
        }
    }
}





