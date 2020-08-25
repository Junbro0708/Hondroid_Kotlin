package com.example.hondroid_pr

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapter (val context: Context, val UserList: ArrayList<User>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_user, null)
        // 리스트의 한 줄 당 아이템은 이 형태를 따라달라는 의미

        val profile = view.findViewById<ImageView>(R.id.iv_profile) // User클래스 모델대로 따라줌
        val name = view.findViewById<TextView>(R.id.tv_name)
        val greet = view.findViewById<TextView>(R.id.tv_greet)
        val age = view.findViewById<TextView>(R.id.tv_age)

        val user = UserList[position]

        profile.setImageResource(user.profile)
        name.text = user.name
        age.text = user.age
        greet.text = user.greet
    }

    override fun getItem(position: Int): Any {

    }

    override fun getItemId(position: Int): Long {

    }

    override fun getCount(): Int {

    }

}