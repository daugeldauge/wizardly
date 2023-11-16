import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.Family

plugins {
    kotlin("multiplatform")
    id("co.touchlab.kmmbridge") version "0.5.1"
    id("com.android.library")
    `maven-publish`
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    targets.withType<KotlinNativeTarget>()
        .matching { it.konanTarget.family == Family.IOS }
        .configureEach {
            binaries.framework {}
        }

    
    sourceSets {
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }

}

version = "0.0.1"

android {
    namespace = "com.daugeldauge.wizardly"
    compileSdk = 33
    defaultConfig {
        minSdk = 33
    }
}

publishing {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/daugeldauge/wizardly")
            credentials {
                username = "daugeldauge"
                password = "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"
            }
        }
    }
}

kmmbridge {
    spm()
    mavenPublishArtifacts()
}