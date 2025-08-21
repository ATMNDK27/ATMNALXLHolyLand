package com.example.util

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

class ToastUtil {

    companion object{
        //最基础的弹出消息封装
        fun toastMessage(context:Context, @StringRes resId: Int, type:Int = 0){
            val duration = when(type){
               0-> Toast.LENGTH_LONG
               else -> Toast.LENGTH_SHORT
            }
            Toast.makeText(context,context.getString(resId),duration).show()
        }
        //对基础弹出进行重载，增强适用性
        fun toastMessage(context:Context, showText: String, type:Int = 0){
            val duration = when(type){
                0-> Toast.LENGTH_LONG
                else -> Toast.LENGTH_SHORT
            }
            Toast.makeText(context,showText,duration).show()
        }
    }
}