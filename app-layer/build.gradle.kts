plugins{
    id("my-application-plugin")
}

dependencies{
    implementation(project(":data-layer"))
    implementation(project(":business-layer"))
}

application{
    mainClass.set("com.demo.app.AppCls")
}