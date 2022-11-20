plugins{
    id("application") //plugin to compile, test Java code
    id("my-plugin-file")
}

//Register a new task
tasks.register<CountAppJars>("countJars"){
    group = "My custom tasks"
    description = "To count the jars used in the application and "

    allJars.from(tasks.jar) // Would get the jars using ConfigurableFileCollection
    allJars.from(configurations.runtimeClasspath)

    countFile.set(layout.buildDirectory.file("output/count.txt")) //Write the count output in a file
}

//Register a new task
tasks.register<Zip>("package"){

    group = "My custom tasks"
    description = "To package jars and run time dependencies into a Zip"

    from(tasks.jar) //take the output of jar task
    from(configurations.runtimeClasspath)// Run time dependencies

    destinationDirectory.set(layout.buildDirectory.dir("distribution"))//Setting output location
}