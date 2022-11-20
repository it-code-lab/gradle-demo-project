plugins{
    //This is a project that has java code that can be built and can be used in another project
    id("java-library") //plugin to compile, test Java code
}

//Configure java version
java{
    toolchain.languageVersion.set(JavaLanguageVersion.of(11));
}