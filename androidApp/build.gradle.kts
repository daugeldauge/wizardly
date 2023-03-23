plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.daugeldauge.wizardly.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.daugeldauge.wizardly.android"
        minSdk = 33
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"

    }
}

dependencies {
    implementation(project(":shared"))
}
