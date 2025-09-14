package com.example.atmnalxlapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.toColorInt
import com.example.atmnalxlapplication.databinding.ActivityMainBinding
import com.example.util.ToastUtil

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
            testBtn.setOnClickListener {
                ToastUtil.toastMessage(this@MainActivity,R.string.success_toast)
//                val intent = Intent(this@MainActivity, MainComposeActivity::class.java)
                val intent = Intent(this@MainActivity, MainContainerActivity::class.java)
                startActivity(intent)
            }
            changeBtn.setOnClickListener {
                if (!tag){
                    showText.setTextColor("#6666CC".toColorInt())
                    tag = !tag
                    return@setOnClickListener
                }
                showText.setTextColor("#c026d3".toColorInt())
                tag = !tag
            }
        }
    }

}