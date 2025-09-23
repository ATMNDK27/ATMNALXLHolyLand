package com.example.atmnalxlapplication

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class MainViewModelTest {
    private lateinit var subject: MainViewModel


    //此注解表示 该注解包含的公共代码函数 会在所有测试之前运行一次
    //按照约定，所有单元测试类，都要有一个以这个注解开头的setup函数
    @org.junit.jupiter.api.BeforeEach
    fun setUp() {
        subject = MainViewModel()
    }

    @Test  //测试函数
    fun exposeSoundNameAsTitle(){

    }

}