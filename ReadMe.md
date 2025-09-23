# 写在前面

# 项目文档简述

我打算做android view 和jetpack compose混合开发试试，两种开发方式都有很明显的优缺点啊

顺便还可以研究迁移老项目到新项目

布局混用方法（来源于chat）

exercise文件为练习验证文件

##  XML 里用 Compose

在 **XML 布局**中嵌入 Compose，用 `ComposeView`：

```xml
<androidx.compose.ui.platform.ComposeView
    android:id="@+id/compose_view"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"/>
```

然后在 Activity / Fragment 里：

```kotlin
findViewById<ComposeView>(R.id.compose_view).setContent {
    HelloCompose("XML 中调用 Compose")
}
```

------

## 🔹 Compose 里用 XML

在 **Compose 界面**里嵌入 XML，用 `AndroidView`：

```kotlin
@Composable
fun LegacyXmlLayout() {
    AndroidView(
        factory = { context ->
            LayoutInflater.from(context).inflate(R.layout.legacy_layout, null)
        }
    )
}
```



## 导入第三方库

- ```groovy
  com.github.zhpanvip:BannerViewPager:3.5.17 //app 模块导入
  ```

- ```groovy
  //导入测试依赖 Mockito app 模块导入
  testImplementation("org.mockito:mockito-core:5.20.0")
  testImplementation("org.mockito:mockito-inline:5.20.0")
  testImplementation("org.mockito:mockito-android:5.20.0")
  ```

  

## 疑问区

1. ##### 在android 中单元测试还是有必要的？什么情况下必须要写单元测试？
