package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    lateinit var imgview: ImageView
    private fun rollfun()
    {
        val num=(1..6).random()
        val result = when (num)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        imgview.setImageResource(result)
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.roll_button).setOnClickListener{
            rollfun()
        }
        imgview=findViewById(R.id.images)
    }
}