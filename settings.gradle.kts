pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("kotlin", "1.8.20-RC2")
            version("agp", "8.0.0-beta05")
        }
    }

    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "wizardly"
include(":androidApp")
include(":shared")