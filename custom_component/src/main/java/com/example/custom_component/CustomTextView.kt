package com.example.custom_component

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView


/**
 * 简单的继承TextView再改造
 * 当前自定义view效果为加一个圆角边框
 */
class CustomTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defaultStyle: Int = 0//主题样式默认值，没有这个指定样式时，系统去找这个样式作为默认样式
): AppCompatTextView(context, attrs, defaultStyle){
    init {
        attrs?.let {
            //从定义的属性中获取值
            context.obtainStyledAttributes(it, R.styleable.CustomTextView).apply {
                //如果没有传入的属性就使用第二个默认值
                val radius = getDimension(R.styleable.CustomTextView_corner_radius,0f)
                val stroke_color = getColor(R.styleable.CustomTextView_stroke_color,-0x666667)
                val stroke_width = getDimension(R.styleable.CustomTextView_stroke_width,0f)

                //background属性为继承的textview
                background = GradientDrawable().apply {
                    cornerRadius = radius
                    setColor(Color.TRANSPARENT) // 透明内部//不设置这个默认为黑色
                    setStroke(stroke_width.toInt(), stroke_color) //正确设置边框
                }
                recycle()//必须回收，因为是从共享的对象，无法被gc回收
            }
        }

        //如果还想加其他功能可以重写父类的相关函数，进行改造
    }

}