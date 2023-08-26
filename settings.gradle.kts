pluginManagement {
    repositories {
        mavenLocal()
        google()
        gradlePluginPortal()
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("kotlin", "1.9.20-Beta-128")
//            version("kotlin", "1.9.10")
            version("agp", "8.0.0")
        }
    }

    @Suppress("UnstableApiUsage")
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
}

rootProject.name = "wizardly"
include(":androidApp")
include(":shared")