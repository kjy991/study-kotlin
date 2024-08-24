import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

// Kotlin 컴파일러의 jvmTarget을 17로 설정
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}
