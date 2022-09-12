import org.checkerframework.gradle.plugin.CheckerFrameworkExtension

plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply the application plugin to add support for building an application
    application

    // Checker Framework build logic
    id("org.checkerframework") version "0.6.16"
}

repositories {
    // You can declare any Maven/Ivy/file repository here.
    mavenCentral()
}

configure<CheckerFrameworkExtension> {
    checkers = listOf(
            "org.checkerframework.checker.nullness.NullnessChecker",
            )
    skipVersionCheck = true
}

dependencies {
    // This dependency is found on compile classpath of this component and consumers.
    // implementation("com.google.guava:guava:26.0-jre")
    val checkerFrameworkVersion = "3.25.0"
    compileOnly("org.checkerframework:checker-qual:$checkerFrameworkVersion")
    testCompileOnly("org.checkerframework:checker-qual:$checkerFrameworkVersion")
    implementation("org.checkerframework:checker-util:$checkerFrameworkVersion")
    checkerFramework("org.checkerframework:checker:$checkerFrameworkVersion")
    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}
