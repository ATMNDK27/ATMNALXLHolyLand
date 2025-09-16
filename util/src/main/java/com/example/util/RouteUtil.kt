package com.example.util

import android.app.Activity
import android.content.Context
import android.content.Intent

/**
 * 创建时间：2025/9/15
 */

//内敛泛型顶层函数//跳转页面使用
inline fun <reified T : Activity> Context.startActivity() {
    val intent = Intent(this, T::class.java)
    if (this !is Activity) {
        //非activity环境下启动页面，将新页面放到新的栈中
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    }
    startActivity(intent)
}
