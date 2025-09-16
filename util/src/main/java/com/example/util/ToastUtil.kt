package com.example.util

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

// 获取全局 Application Context（安全）
//val Context.appContext: Context
//    get() = this.applicationContext
//  扩展函数：让任意 Context 都能直接 toast
fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

fun Context.toast(@StringRes resId: Int, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, getString(resId), duration).show()
}