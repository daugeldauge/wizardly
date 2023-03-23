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
        }

        pod("Base64", version = "1.1.2")


        pod("pod_dependency") {
            version = "1.0"
            source = path(project.file("../pod_dependency"))

            extraOpts = listOf("-compiler-option", "-fmodules")
        }

        pod("subspec_dependency/Core") {
            version = "1.0"
            source = path(project.file("../subspec_dependency"))
        }
    }
    
    sourceSets {
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