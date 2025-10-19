package com.example.custom_component

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.example.custom_component.databinding.CustomviewSerachBinding
import com.example.util.toast

class CustomCombinateSearchView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defaultStyle: Int = 0
): ConstraintLayout(context,attrs,defaultStyle){

    private val binding: CustomviewSerachBinding =
        CustomviewSerachBinding.inflate(LayoutInflater.from(context),this,true)

    private var serachHint: String? = null
    private var confirmText: String? = null


    init {
        //从属性集合中获取相关值
        context.obtainStyledAttributes(attrs,R.styleable.CustomCombinateSearchView).apply {
            serachHint = getString(R.styleable.CustomCombinateSearchView_search_hint)?:"请输入搜索内容"
            confirmText = getString(R.styleable.CustomCombinateSearchView_confirm_text) ?:"确认"
        }



        //从资源文件中加载drawable 对象
        val drawableEnd = ContextCompat.getDrawable(context, R.mipmap.ic_launcher)
        binding.apply {
            confirmBtn.text = confirmText
            searchEdit.hint = serachHint
            confirmBtn.setOnClickListener {
                context.toast("点击确认成功")
            }
            searchEdit.addTextChangedListener(object : TextWatcher{
                override fun afterTextChanged(s: Editable?) {
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    //设置隐藏右侧图标
                    searchEdit.setCompoundDrawablesWithIntrinsicBounds(
                        null,
                        null,
                        if (s.isNullOrBlank()) drawableEnd else null,
                        null
                    )
                }

                override fun onTextChanged(
                    s: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
                ) {
                }

            })
        }
    }

}