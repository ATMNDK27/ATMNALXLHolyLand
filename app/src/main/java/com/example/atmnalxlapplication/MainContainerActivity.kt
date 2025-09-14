package com.example.atmnalxlapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_container)
        //返回系统栏（状态栏和导航栏）的insets类型
        //当系统窗口（状态栏/导航栏/手势/键盘）尺寸变化时，自动把 R.id.main 这个 View 的 padding 调整为系统栏的大小。
        //insets 里存的就是「系统 UI 占用了多少像素」的信息。
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }
    }
}