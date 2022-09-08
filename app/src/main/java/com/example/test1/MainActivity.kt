package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//fragment는 이동이 Activity간 이루어지는 것이 아니라 한 화면 즉 한 Activiry에서 이동이 일어남
//네비게이션 만들고 fragment들 만들어야 함
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}