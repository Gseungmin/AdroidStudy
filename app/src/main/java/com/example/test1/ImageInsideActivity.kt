package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        //Intent 데이터 수신
        val getData = intent.getStringExtra("data");
        //ImageView Id와 일치하는 곳에 데이터 저장하기 위한 변수
        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        if (getData == "1") {
            memberImage.setImageResource(R.drawable.member_1)
        } else if (getData == "2") {
            memberImage.setImageResource(R.drawable.member_2)
        } else if (getData == "3") {
            memberImage.setImageResource(R.drawable.member_3)
        } else if (getData == "4") {
            memberImage.setImageResource(R.drawable.member_4)
        } else if (getData == "5") {
            memberImage.setImageResource(R.drawable.member_5)
        } else if (getData == "6") {
            memberImage.setImageResource(R.drawable.member_6)
        } else if (getData == "7") {
            memberImage.setImageResource(R.drawable.member_7)
        } else if (getData == "8") {
            memberImage.setImageResource(R.drawable.member_8)
        } else {
            memberImage.setImageResource(R.drawable.member_9)
        }
    }
}