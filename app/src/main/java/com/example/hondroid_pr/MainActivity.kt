package com.example.hondroid_pr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener {
            // val 은 final과 동일하게 값이 변경되지 않고, var은 변수

            val intent = Intent(this, SubActivity::class.java) // 다음 화면으로 이동하기 위한 객체 생성
            intent.putExtra("msg", tv_sendMsg.text.toString()) // 키값과 보내는 값을 넣어주어야함
            startActivity(intent)
            //finish() // 화면을 전환 후 메인 액티비티가 필요가 없어지면, 자신의 액티비티를 제거
        }

        btn_Toast.setOnClickListener {
            iv_profile.setImageResource(R.drawable.androidd) // 이미지뷰에 새로운 이미지 등록
            Toast.makeText(this@MainActivity, "버튼이 클릭되었습니다.", Toast.LENGTH_SHORT).show()
        }

        btn_list.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }
}
