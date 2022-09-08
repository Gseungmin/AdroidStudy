package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.test1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var isDouble = false
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //먼저 Adapter로 데이터 전송
        //Adatper에서 xml에 하나씩 값을 넣어 ListView xml에 넣어주는 것이다.
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

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.randomContent.setText(sentenceList.random().content)

        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }
    }

    //backBtn 관리
    override fun onBackPressed() {
        Log.d("MainActivity", "back")
        if (isDouble == true) {
            finish()
        }
        isDouble = true
        Toast.makeText(this, "종료하시려면 더블클릭 해주세요", Toast.LENGTH_LONG).show()

        Handler().postDelayed(Runnable {
            isDouble = false
        }, 1000)
    }
}