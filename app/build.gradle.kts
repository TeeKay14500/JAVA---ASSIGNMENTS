plugins {
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.guava)

    testImplementation("org.junit.jupiter:junit-jupiter:6.0.1")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

javafx {
    version = "21"
    modules = listOf("javafx.controls", "javafx.fxml")
}

application {
    mainClass = "org.example.App"
}

tasks.test {
    failOnNoDiscoveredTests = false
}

tasks.named<JavaExec>("run") {
    notCompatibleWithConfigurationCache("JavaExec run task")
}
