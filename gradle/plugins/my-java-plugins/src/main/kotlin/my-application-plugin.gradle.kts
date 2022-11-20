import gradle.kotlin.dsl.accessors._60db6352840e4faf938231443a53bad2.java
import org.gradle.jvm.toolchain.JavaLanguageVersion

plugins{
    //This is a project that has java code that can be built and can be used in another project
    id("application") //plugin to compile, test Java code
}

//Configure java version
java{
    toolchain.languageVersion.set(JavaLanguageVersion.of(11));
}