plugins {
    kotlin("jvm") version "1.4.32"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "de.imateapot"
version = "1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots") }
    maven { url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") }
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly( "org.spigotmc:spigot-api:1.16.5-R0.1-SNAPSHOT")
}
