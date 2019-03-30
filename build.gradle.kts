import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.3.21"
}

group = "dev.hienph.toys"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {
    repositories {
        mavenCentral()
    }
}

// configure<JavaPluginConvention> {
//     sourceCompatibility = JavaVersion.VERSION_1_8
// }
//
// tasks.withType<KotlinCompile> {
//     kotlinOptions.jvmTarget = "1.8"
// }