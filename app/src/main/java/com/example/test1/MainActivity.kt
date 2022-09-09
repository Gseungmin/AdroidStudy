package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//fragment는 이동이 Activity간 이루어지는 것이 아니라 한 화면 즉 한 Activiry에서 이동이 일어남
//네비게이션 만들고 fragment들 만들어야 함
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1. 네비게이션 만들기

        //2. Fragment 만들고 연결하기
            //2.1 Fragment에서 이미지 누르면 이동

        //3. 리사이클러뷰 만들기
        //3.1xml 수정
        //3.2어댑터 클래스 만들기
        //3.3리사리클러 뷰 아이템 만들기
    }
}