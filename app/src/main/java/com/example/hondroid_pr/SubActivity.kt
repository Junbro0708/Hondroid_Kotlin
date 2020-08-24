package com.example.hondroid_pr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        if(intent.hasExtra("msg")) {
            tv_getMsg.text = intent.getStringExtra("msg") // 서브 액티비티에 존재하는 텍스트뷰에 텍스트가 넘겨져옴
        }
    }
}
