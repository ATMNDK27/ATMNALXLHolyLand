package com.example.atmnalxlapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.atmnalxlapplication.databinding.ActivityMyBinding
import com.example.util.toast

class MyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.settingBtn.setOnClickListener {
            toast(R.string.setting_clicked)
        }
    }
}
