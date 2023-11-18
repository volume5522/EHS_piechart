pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        //현호가 추가한 부분 여기부터
        jcenter()
        maven { url = uri("https://jitpack.io") }
        //여기까지
        rootProject.name = "E.H.S"
        include(":app")
    }
}