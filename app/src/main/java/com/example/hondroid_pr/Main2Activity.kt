package com.example.hondroid_pr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn_navi.setOnClickListener {
            layout_drawer.openDrawer(GravityCompat.START) // 스타트는 레프트와 같고, 앤드는 라이드와 같다
        }

        navi_view.setNavigationItemSelectedListener(this) // 네비게이션 메뉴 아이템에 클릭 속성 부여, 밑에 코드를 쓰기위한 결정적코드
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean { // 네비게이션 메뉴 아이템 클릭시 수행
        when (item.itemId) {
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
            R.id.email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.send -> Toast.makeText(applicationContext, "메세지", Toast.LENGTH_SHORT).show()
        }
        layout_drawer.closeDrawers() // 버튼을 클릭했을 때 토스트를 하면서 드로어 메뉴를 닫기
        return false
    }

    override fun onBackPressed() {

        if(layout_drawer.isDrawerOpen(GravityCompat.START)) {
            layout_drawer.closeDrawers()
        } else {
            super.onBackPressed() // 일반 백버튼 기능실행
        }


    }
}
