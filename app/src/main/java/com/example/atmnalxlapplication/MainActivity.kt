package com.example.atmnalxlapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.toColorInt
import com.example.atmnalxlapplication.databinding.ActivityMainBinding
import com.example.atmnalxlapplication.exercise.AnimationMainActivity
import com.example.ui_compose.MainComposeActivity
import com.example.util.startActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
         mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        var tag = false

        //监听点击事件
        mainBinding.apply {
            testBtn1.setOnClickListener {
                startActivity<AnimationMainActivity>()
            }
            testBtn2.setOnClickListener {
                startActivity<MainComposeActivity>()
            }
            testBtn3.setOnClickListener {
                startActivity<MainContainerActivity>()
            }

        }
    }

}