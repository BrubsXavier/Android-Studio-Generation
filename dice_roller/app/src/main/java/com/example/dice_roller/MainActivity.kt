package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val d4 = findViewById<Button>(R.id.dice_d4)
        val d6 = findViewById<Button>(R.id.dice_d6)
        val d8 = findViewById<Button>(R.id.dice_d8)
        val d10 = findViewById<Button>(R.id.dice_d10)
        val d12 = findViewById<Button>(R.id.dice_d12)
        val d20 = findViewById<Button>(R.id.dice_d20)

        d4.setOnClickListener {
            rolldice(4)
        }

        d6.setOnClickListener {
            rolldice(6)
        }

        d8.setOnClickListener {
            rolldice(8)
        }

        d10.setOnClickListener {
            rolldice(10)
        }

        d12.setOnClickListener {
            rolldice(12)
        }

        d20.setOnClickListener {
            rolldice(20)
        }
    }

    private fun rolldice(lados: Int) {
        val roll = (1..lados).random()

        val textresult = findViewById<TextView>(R.id.textresult)
        val diceimage = findViewById<ImageView>(R.id.diceimage)

        textresult.text = roll.toString()

        when (lados) {

            4 -> {

                when(roll) {
                    1 -> diceimage.setImageResource(R.drawable.d4_1)
                    2 -> diceimage.setImageResource(R.drawable.d4_2)
                    3 -> diceimage.setImageResource(R.drawable.d4_3)
                    4 -> diceimage.setImageResource(R.drawable.d4_4)

                }

            }

            6 -> {

                when(roll) {
                    1 -> diceimage.setImageResource(R.drawable.d6_1)
                    2 -> diceimage.setImageResource(R.drawable.d6_2)
                    3 -> diceimage.setImageResource(R.drawable.d6_3)
                    4 -> diceimage.setImageResource(R.drawable.d6_4)
                    5 -> diceimage.setImageResource(R.drawable.d6_5)
                    6 -> diceimage.setImageResource(R.drawable.d6_6)

                }

            }

            8 -> {

                when(roll) {
                    1 -> diceimage.setImageResource(R.drawable.d8_1)
                    2 -> diceimage.setImageResource(R.drawable.d8_2)
                    3 -> diceimage.setImageResource(R.drawable.d8_3)
                    4 -> diceimage.setImageResource(R.drawable.d8_4)
                    5 -> diceimage.setImageResource(R.drawable.d8_5)
                    6 -> diceimage.setImageResource(R.drawable.d8_6)
                    7 -> diceimage.setImageResource(R.drawable.d8_7)
                    8 -> diceimage.setImageResource(R.drawable.d8_8)

                }

            }

            10 -> {

                when(roll) {
                    1 -> diceimage.setImageResource(R.drawable.d10_1)
                    2 -> diceimage.setImageResource(R.drawable.d10_2)
                    3 -> diceimage.setImageResource(R.drawable.d10_3)
                    4 -> diceimage.setImageResource(R.drawable.d10_4)
                    5 -> diceimage.setImageResource(R.drawable.d10_5)
                    6 -> diceimage.setImageResource(R.drawable.d10_6)
                    7 -> diceimage.setImageResource(R.drawable.d10_7)
                    8 -> diceimage.setImageResource(R.drawable.d10_8)
                    9 -> diceimage.setImageResource(R.drawable.d10_9)
                    10 -> diceimage.setImageResource(R.drawable.d10_10)

                }

            }

            12 -> {

                when(roll) {
                    1 -> diceimage.setImageResource(R.drawable.d12_1)
                    2 -> diceimage.setImageResource(R.drawable.d12_2)
                    3 -> diceimage.setImageResource(R.drawable.d12_3)
                    4 -> diceimage.setImageResource(R.drawable.d12_4)
                    5 -> diceimage.setImageResource(R.drawable.d12_5)
                    6 -> diceimage.setImageResource(R.drawable.d12_6)
                    7 -> diceimage.setImageResource(R.drawable.d12_7)
                    8 -> diceimage.setImageResource(R.drawable.d12_8)
                    9 -> diceimage.setImageResource(R.drawable.d12_9)
                    10 -> diceimage.setImageResource(R.drawable.d12_10)
                    11 -> diceimage.setImageResource(R.drawable.d12_11)
                    12 -> diceimage.setImageResource(R.drawable.d12_12)

                }

            }

            20 -> {

                when(roll) {
                    1 -> diceimage.setImageResource(R.drawable.d20_1)
                    2 -> diceimage.setImageResource(R.drawable.d20_2)
                    3 -> diceimage.setImageResource(R.drawable.d20_3)
                    4 -> diceimage.setImageResource(R.drawable.d20_4)
                    5 -> diceimage.setImageResource(R.drawable.d20_5)
                    6 -> diceimage.setImageResource(R.drawable.d20_6)
                    7 -> diceimage.setImageResource(R.drawable.d20_7)
                    8 -> diceimage.setImageResource(R.drawable.d20_8)
                    9 -> diceimage.setImageResource(R.drawable.d20_9)
                    10 -> diceimage.setImageResource(R.drawable.d20_10)
                    11 -> diceimage.setImageResource(R.drawable.d20_11)
                    12 -> diceimage.setImageResource(R.drawable.d20_12)
                    13 -> diceimage.setImageResource(R.drawable.d20_13)
                    14 -> diceimage.setImageResource(R.drawable.d20_14)
                    15 -> diceimage.setImageResource(R.drawable.d20_15)
                    16 -> diceimage.setImageResource(R.drawable.d20_16)
                    17 -> diceimage.setImageResource(R.drawable.d20_17)
                    18 -> diceimage.setImageResource(R.drawable.d20_18)
                    19 -> diceimage.setImageResource(R.drawable.d20_19)
                    20 -> diceimage.setImageResource(R.drawable.d20_20)

                }

            }
        }
    }

}



