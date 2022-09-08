package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.test1.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dice1 = binding.dice1
        val dice2 = binding.dice2

        binding.diceBtn.setOnClickListener{
            Toast.makeText(this, "주사위가 던져집니다.", Toast.LENGTH_LONG).show()

            val first = Random.nextInt(1,6)
            val second = Random.nextInt(1,6)

            if (first == 1) {
                dice1.setImageResource(R.drawable.dice_1)
            } else if (first == 2) {
                dice1.setImageResource(R.drawable.dice_2)
            } else if (first == 3) {
                dice1.setImageResource(R.drawable.dice_3)
            } else if (first == 4) {
                dice1.setImageResource(R.drawable.dice_4)
            } else if (first == 5) {
                dice1.setImageResource(R.drawable.dice_5)
            } else if (first == 6) {
                dice1.setImageResource(R.drawable.dice_6)
            }

            if (second == 1) {
                dice2.setImageResource(R.drawable.dice_1)
            } else if (second == 2) {
                dice2.setImageResource(R.drawable.dice_2)
            } else if (second == 3) {
                dice2.setImageResource(R.drawable.dice_3)
            } else if (second == 4) {
                dice2.setImageResource(R.drawable.dice_4)
            } else if (second == 5) {
                dice2.setImageResource(R.drawable.dice_5)
            } else if (second == 6) {
                dice2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}