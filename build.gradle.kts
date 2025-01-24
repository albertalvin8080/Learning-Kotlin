plugins {
    kotlin("jvm") version "2.0.21"
    application
}

group = "org.albert"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    // mainClass.set("_11_Coroutines.RunBlockingKt")
    // mainClass.set("_11_Coroutines.AsyncKt")
    mainClass.set("_01_Functions.ReturnFromLambdaKt")
}

// gradlew run -PappArgs="arg1 arg2 arg3"
tasks.withType<JavaExec> {
    if (project.hasProperty("appArgs")) {
        args = project.property("appArgs").toString().split(' ')
        println(args)
    }
}