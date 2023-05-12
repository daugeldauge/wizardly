plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
//            isStatic = true

            export("com.arkivanov.decompose:decompose:2.0.0-alpha-02")
        }
//        useLibraries()

//        pod("FlipperKit") {
//            moduleName = "CouchbaseLite"
//            packageName = "cocoapods.CouchbaseLite"
//        }


    }
    
    sourceSets {
        commonMain {
            dependencies {
                api("com.arkivanov.decompose:decompose:2.0.0-alpha-02")
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }

}

android {
    namespace = "com.daugeldauge.wizardly"
    compileSdk = 33
    defaultConfig {
        minSdk = 33
    }
}