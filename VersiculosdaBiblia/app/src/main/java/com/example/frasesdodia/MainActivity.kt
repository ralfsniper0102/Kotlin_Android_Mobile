package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var texto: TextView
    val frases = arrayOf(
        "Salmos 103:13\n\n" + "Como um pai trata com bondade os seus filhos, assim o Senhor é bondoso para aqueles que o temem.",
        "Mateus 7:7\n\n" +"— Peçam e vocês receberão; procurem e vocês acharão; batam, e a porta será aberta para vocês.",
        "Provérbios 19:21\n\n" +"As pessoas fazem muitos planos, mas quem decide é Deus, o Senhor .",
        "Tiago 1:19\n\n" +"Lembrem disto, meus queridos irmãos: cada um esteja pronto para ouvir, mas demore para falar e ficar com raiva.",
        "Mateus 6:19\n\n" + "— Não ajuntem riquezas aqui na terra, onde as traças e a ferrugem destroem, e onde os ladrões arrombam e roubam.",
        "Salmos 23:6\n\n" + "Certamente a tua bondade e o teu amor ficarão comigo enquanto eu viver. E na tua casa, ó Senhor , morarei todos os dias da minha vida.",
        "Isaías 64:8\n\n" + "Mas tu, ó Senhor Deus, és o nosso Pai; nós somos o barro, tu és o oleiro, todos nós fomos feitos por ti.",
        "2Pedro 3:9\n\n" + "O Senhor não demora a fazer o que prometeu, como alguns pensam. Pelo contrário, ele tem paciência com vocês porque não quer que ninguém seja destruído, mas deseja que todos se arrependam dos seus pecados.",
        "Provérbios 4:23\n\n" + "Tenha cuidado com o que você pensa, pois a sua vida é dirigida pelos seus pensamentos."
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView_Frase)

    }
    fun gerarFrase(view: View){
        var total = frases.size
        var randomico = Random.nextInt(total)
        texto.setText(frases[randomico])



    }
}