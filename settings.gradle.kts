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
            version("kotlin", "1.8.20-RC2")
            version("agp", "8.0.0-rc01")
        }
    }

    repositories {
        mavenLocal()
        google()
        mavenCentral()
    }
}

rootProject.name = "wizardly"
include(":androidApp")
include(":shared")