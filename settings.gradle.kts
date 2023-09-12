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
//            version("kotlin", "1.9.255-54362")
            version("kotlin", "1.9.20-Beta")
            version("agp", "8.0.0")
        }
    }

    @Suppress("UnstableApiUsage")
    repositories {
        mavenLocal()
        google()
        mavenCentral()
    }
}

rootProject.name = "wizardly"
include(":androidApp")
include(":shared")