package com.example.atmnalxlapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atmnalxlapplication.databinding.ActivityMainBinding
import com.example.atmnalxlapplication.exercise.AnimationMainActivity
import com.example.util.startActivity

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
//                val intent = Intent(this@MainActivity, MainContainerActivity::class.java)
//                startActivity(intent)
               // startActivity<MainContainerActivity>()
                startActivity<AnimationMainActivity>()
            }

        }
    }

}