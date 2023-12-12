/*
 * Copyright © [2023] by [Nurul Qistina Binti Osman Talib]. All rights reserved.
 *
 * This work is for course ICT602 , Sir Hafiz .
 * This work, including all text, images, and other content, is a proprietary of me .
 * Any unauthorized use, reproduction, or distribution is strictly prohibited.
 *
 *
 *
 */

plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.zakatcalculator"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.zakatcalculator"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}