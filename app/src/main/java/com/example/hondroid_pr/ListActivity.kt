package com.example.hondroid_pr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티의 실행 시작지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val item = arrayOf("지향", "용", "지원", "기마", "준형")

        // Context란 한 액티비티의 모든 정보를 담고 있음
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item) // adapter가 있어야만 리스트뷰 만들 수 있음
    }
}
