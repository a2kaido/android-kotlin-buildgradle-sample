repositories {
    jcenter()
    google()
}

object BuildSettings {
    val version = 1
    val name = "1.0.0"
}

plugins {
    id("com.android.application") version "3.0.0"
    kotlin("android")
}

android {
    compileSdkVersion(26)
    defaultConfig {
        applicationId = "jp.a2kaido.kts"
        minSdkVersion(21)
        targetSdkVersion(26)
        versionCode = BuildSettings.version
        versionName = BuildSettings.name
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jre7:1.1.51")
    implementation("com.android.support:appcompat-v7:26.1.0")
    implementation("com.android.support.constraint:constraint-layout:1.0.2")
}