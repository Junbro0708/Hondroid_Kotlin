package com.example.hondroid_pr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android33, "영온", "24", "마리온뚜아네뜨"),
        User(R.drawable.android33, "정민", "24", "단발머리그녀"),
        User(R.drawable.android33, "진선", "24", "일본워홀"),
        User(R.drawable.android33, "상하", "24", "와우아버지"),
        User(R.drawable.android33, "정근", "23", "멀대"),
        User(R.drawable.android33, "지성", "24", "링피트헬창"),
        User(R.drawable.android33, "준형", "24", "멋쟁이")
    )

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티의 실행 시작지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

//        val item = arrayOf("지향", "용", "지원", "기마", "준형")
//
//        // Context란 한 액티비티의 모든 정보를 담고 있음
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item) // adapter가 있어야만 리스트뷰 만들 수 있음

        val adapter = UserAdapter(this, UserList)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name + "이는 " + selectItem.age + "살입니다 : " + selectItem.greet, Toast.LENGTH_SHORT).show()
        }

    }
}
