
plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
//    id("com.android.library")
}

kotlin {
    jvm()
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
    }
    
    sourceSets {
        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
                implementation("co.touchlab:kermit:2.0.0-RC4") //Add latest version
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

//android {
//    namespace = "com.daugeldauge.wizardly"
//    compileSdk = 33
//    defaultConfig {
//        minSdk = 33
//    }
//}