plugins{
    //This is a project that has java code that can be built and can be used in another project
    id("my-plugin-file") //plugin to compile, test Java code
}

dependencies{
    implementation(project(":data-layer"))
}