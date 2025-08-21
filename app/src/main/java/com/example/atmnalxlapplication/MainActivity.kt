package com.example.atmnalxlapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.example.atmnalxlapplication.databinding.ActivityMainBinding
import com.example.util.ToastUtil

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
         mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)


        //监听点击事件
        mainBinding.apply {
            showText.setOnClickListener {
                ToastUtil.toastMessage(this@MainActivity,R.string.success_toast)
            }
        }
    }

}