package com.example.atmnalxlapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.util.AttributeSet
import android.view.View
import com.example.atmnalxlapplication.databinding.ActivityMainBinding
import com.example.ui_compose.MainComposeActivity
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
            testBtn.setOnClickListener {
                ToastUtil.toastMessage(this@MainActivity,R.string.success_toast)
                val intent = Intent(this@MainActivity, MainComposeActivity::class.java)
                startActivity(intent)
            }
        }
    }

}