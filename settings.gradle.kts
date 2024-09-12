pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
include(":app-bindings")

include("library1-api")
project(":library1-api").projectDir = file("./libs/library1/api")
include("library1-binding")
project(":library1-binding").projectDir = file("./libs/library1/binding")
include("library1-impl")
project(":library1-impl").projectDir = file("./libs/library1/impl")

include("library2-api")
project(":library2-api").projectDir = file("./libs/library2/api")
include("library2-binding")
project(":library2-binding").projectDir = file("./libs/library2/binding")
include("library2-impl")
project(":library2-impl").projectDir = file("./libs/library2/impl")
