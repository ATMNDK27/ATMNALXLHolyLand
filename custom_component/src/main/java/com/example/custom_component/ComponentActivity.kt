package com.example.custom_component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ComponentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component)
    }
}