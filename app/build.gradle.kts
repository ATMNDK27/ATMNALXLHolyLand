plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.atmnalxlapplication"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.atmnalxlapplication"
        minSdk = 27
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    buildFeatures {
        dataBinding = true
    }
//    kotlin {
//        jvmToolchain {
//            languageVersion.set(JavaLanguageVersion.of(21))
//        }
//    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.13.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation("androidx.activity:activity:1.11.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.13.4")
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")

//    引入本地工具类模块
    implementation(project(":util"))
    implementation(project(":custom_component"))
    implementation(project(":ui_compose"))


    //引入轮播图第三方库，进行动画变化学习
    implementation("com.github.zhpanvip:BannerViewPager:3.5.17")


    //导入测试依赖 Mockito
    testImplementation("org.mockito:mockito-core:5.20.0")
    testImplementation("org.mockito:mockito-inline:5.20.0")
    testImplementation("org.mockito:mockito-android:5.20.0")


}