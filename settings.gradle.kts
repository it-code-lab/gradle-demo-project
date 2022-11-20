//Plugins to implement gradle interfaces
pluginManagement{
    repositories.gradlePluginPortal()

    includeBuild("gradle/plugins")
}


//Location to potentially find components/dependencies
dependencyResolutionManagement{
    repositories.mavenCentral();
}

//Giving a fixed name to the build. If not provided it will be picked up as the project folder name.
rootProject.name = "my-sample-project"

//Include sub projects
include("app-layer")
include("business-layer")
include("data-layer")