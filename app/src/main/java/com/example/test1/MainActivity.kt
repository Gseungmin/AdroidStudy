package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //image1 가져오기
        val image1 = findViewById<ImageView>(R.id.image1)
        //image1이 클릭되었을때 처리
        image1.setOnClickListener {

            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            //화면 전환
            val intent = Intent(this, ClickActivity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.image2)
        image2.setOnClickListener {

            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()

            //화면 전환
            val intent = Intent(this, ClickAcivity2::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.image3)
        image3.setOnClickListener {

            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()

            //화면 전환
            val intent = Intent(this, ClickAcivity3::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.image4)
        image4.setOnClickListener {

            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show()

            //화면 전환
            val intent = Intent(this, ClickAcivity4::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.image5)
        image5.setOnClickListener {

            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_LONG).show()

            //화면 전환
            val intent = Intent(this, ClickAcivity5::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.image6)
        image6.setOnClickListener {

            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_LONG).show()

            //화면 전환
            val intent = Intent(this, ClickAcivity6::class.java)
            startActivity(intent)
        }

        val image7 = findViewById<ImageView>(R.id.image7)
        image7.setOnClickListener {

            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_LONG).show()

            //화면 전환
            val intent = Intent(this, ClickAcivity7::class.java)
            startActivity(intent)
        }
    }
}