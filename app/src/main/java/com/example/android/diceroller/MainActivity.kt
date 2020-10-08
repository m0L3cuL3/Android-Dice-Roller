package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // roll button
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll!"

        // event listeners
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    fun rollDice() {
        val randInt = Random().nextInt(6) + 1
        val diceImage: ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }

}