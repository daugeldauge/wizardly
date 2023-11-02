import org.jetbrains.kotlin.gradle.plugin.mpp.NativeOutputKind
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeOutputKind.EXECUTABLE
import org.jetbrains.kotlin.gradle.targets.native.tasks.PodGenTask

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    jvm()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosArm64()
    macosX64()
    js()

    cocoapods {
        version = "1.0"
        framework {
            isStatic = true
        }
//        pod("Base64", version = "1.1.2")
    }

    metadata { compilations.all { kotlinOptions.freeCompilerArgs += "-Xallow-kotlin-package" } }
    targets.all { compilations.all { kotlinOptions.freeCompilerArgs += "-Xallow-kotlin-package" } }
    
    sourceSets {
//        commonMain.dependencies {
//            implementation("co.touchlab:kermit:2.0.0")
//        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
