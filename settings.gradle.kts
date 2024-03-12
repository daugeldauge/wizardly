pluginManagement {
    repositories {
        mavenLocal()
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
//            version("kotlin", "2.0.255-65542")
            version("kotlin", "1.9.23")
            version("agp", "8.0.0")
        }
    }

    @Suppress("UnstableApiUsage")
    repositories {
        mavenLocal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
        google()
        mavenCentral()
    }
}

rootProject.name = "wizardly"
include(":androidApp")
include(":shared")