package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageInside1 = findViewById<ImageView>(R.id.member1)
        imageInside1.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            //Intent 데이터 전송
            intent.putExtra("data","1")
            startActivity(intent)
        }

        val imageInside2 = findViewById<ImageView>(R.id.member2)
        imageInside2.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            //Intent 데이터 전송
            intent.putExtra("data","2")
            startActivity(intent)
        }

        val imageInside3 = findViewById<ImageView>(R.id.member3)
        imageInside3.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            //Intent 데이터 전송
            intent.putExtra("data","3")
            startActivity(intent)
        }

        val imageInside4 = findViewById<ImageView>(R.id.member4)
        imageInside4.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            //Intent 데이터 전송
            intent.putExtra("data","4")
            startActivity(intent)
        }

        val imageInside5 = findViewById<ImageView>(R.id.member5)
        imageInside5.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            //Intent 데이터 전송
            intent.putExtra("data","5")
            startActivity(intent)
        }

        val imageInside6 = findViewById<ImageView>(R.id.member6)
        imageInside6.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            //Intent 데이터 전송
            intent.putExtra("data","6")
            startActivity(intent)
        }

        val imageInside7 = findViewById<ImageView>(R.id.member7)
        imageInside7.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            //Intent 데이터 전송
            intent.putExtra("data","7")
            startActivity(intent)
        }

        val imageInside8 = findViewById<ImageView>(R.id.member8)
        imageInside8.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            //Intent 데이터 전송
            intent.putExtra("data","8")
            startActivity(intent)
        }

        val imageInside9 = findViewById<ImageView>(R.id.member9)
        imageInside9.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            //Intent 데이터 전송
            intent.putExtra("data","9")
            startActivity(intent)
        }
    }
}