package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<SentenceModel>()
        sentenceList.add(SentenceModel("두리"))
        sentenceList.add(SentenceModel("나리"))
        sentenceList.add(SentenceModel("제리"))
        sentenceList.add(SentenceModel("해리"))
        sentenceList.add(SentenceModel("또또"))
        sentenceList.add(SentenceModel("딸기"))
        sentenceList.add(SentenceModel("뽀미"))
        sentenceList.add(SentenceModel("순둥이"))
        sentenceList.add(SentenceModel("똑똑이"))
        sentenceList.add(SentenceModel("루루"))
        sentenceList.add(SentenceModel("미미"))
        sentenceList.add(SentenceModel("뽀삐"))

        //데이터 전달
        val adapter = ListViewAdapter(sentenceList)

        //activity_main에 listView 가져오기
        val listView = findViewById<ListView>(R.id.sentenceListView)

        //listView의 adater에 우리가 만든 adapter 연결
        listView.adapter = adapter
    }
}