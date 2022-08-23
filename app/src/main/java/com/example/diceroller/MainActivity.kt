package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
//import android.widget.TextView
import android.widget.Toast
import java.util.Random


class MainActivity : AppCompatActivity() {

     lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
     //  rollButton.text = "Lets Roll" // to check if button is correctly accessed using findViewById
        rollButton.setOnClickListener {
            Toast.makeText(this,"Dice rolled",Toast.LENGTH_SHORT).show() //to check if it works when button pressed
            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {


       // val resultText : TextView = findViewById(R.id.result_Text)
      //  resultText.text = "Dice rolled"

       // val randomInt = Random().nextInt(6)+1 //automatically tells to create inline variable
        //  resultText.text = randomInt.toString()

        val drawableResource = when ((Random().nextInt(6)+1)) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

      //  val diceImage : ImageView = findViewById(R.id.dice_image) this line will cause search of the View hirarchy every time we read and its expensive operation so we find a better approach - 1 and 2
        diceImage.setImageResource(drawableResource)
    }
}