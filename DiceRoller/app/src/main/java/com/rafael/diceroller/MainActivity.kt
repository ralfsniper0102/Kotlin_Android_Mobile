package com.rafael.diceroller

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        buttonJogarDado.setOnClickListener {
            var n1 : Int
            n1 = (1..6).random()  ///////////// comando Randomico

            when {
                n1 == 1->{imageViewDado.setImageResource(R.drawable.dice_1)}
                n1 == 2->{imageViewDado.setImageResource(R.drawable.dice_2)}
                n1 == 3->{imageViewDado.setImageResource(R.drawable.dice_3)}
                n1 == 4->{imageViewDado.setImageResource(R.drawable.dice_4)}
                n1 == 5->{imageViewDado.setImageResource(R.drawable.dice_5)}
                n1 == 6->{imageViewDado.setImageResource(R.drawable.dice_6)}


            }

        }


    }
}