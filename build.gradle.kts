plugins {
    `java-library`
    `maven-publish`
    signing
    id("com.github.spotbugs") version "5.0.13"
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0-rc-1"
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("asm:asm-tree:3.0")
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
    implementation("oro:oro:2.0.8")
    testImplementation("junit:junit:4.13.1")
}

group = "com.github.takawitter"
version = "0.9.8"
description = "Trie4J"

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            pom {
                name.set("Trie4j")
                description.set("Various TRIE implementation including DoubleArray and LOUDS by Java.")
                url.set("https://github.com/miurahr/trie4j")
                licenses {
                    license {
                        name.set("Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0")
                        distribution.set("repo")
                    }
                }
                developers {
                    developer {
                        id.set("miurahr")
                        name.set("Hiroshi Miura")
                        email.set("miurahr@linux.com")
                    }
                    developer {
                        name.set("Takao Nakaguchi")
                        email.set("takao.nakaguchi@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/miurahr/trie4j.git")
                    developerConnection.set("scm:git:git://github.com/miurahr/trie4j.git")
                    url.set("https://github.com/miurahr/trie4j")
                }
            }
        }
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-Xlint:deprecation")
    options.compilerArgs.add("-Xlint:unchecked")
}

java {
    toolchain {
         languageVersion.set(JavaLanguageVersion.of(11))
    }
    withSourcesJar()
    withJavadocJar()
}

val signKey = listOf("signingKey", "signing.keyId", "signing.gnupg.keyName").find {project.hasProperty(it)}
tasks.withType<Sign> {
    onlyIf { signKey != null }
}

signing {
    when (signKey) {
        "signingKey" -> {
            val signingKey: String? by project
            val signingPassword: String? by project
            useInMemoryPgpKeys(signingKey, signingPassword)
        }
        "signing.keyId" -> {
            // default signatory - do nothing()
            // please set
            // signing.keyId = 0xAAAAAA
            // signing.password = "signature passphrase"
            // secretKeyRingFile = "secring.gpg"
            // e.g. gpg --export-secret-keys > secring.gpg
        }
        "signing.gnupg.keyName" -> {
            useGpgCmd()
        }
    }
    sign(publishing.publications["mavenJava"])
}

val sonatypeUsername: String? by project
val sonatypePassword: String? by project

nexusPublishing {
    repositories{
        sonatype {
            if (sonatypeUsername != null && sonatypePassword != null) {
                username.set(sonatypeUsername)
                password.set(sonatypePassword)
            } else {
                username.set(System.getenv("SONATYPE_USER"))
                password.set(System.getenv("SONATYPE_PASS"))
            }
        }
    }
}

spotbugs {
    setReportLevel("high")
    // excludeFilter.set(project.file("config/spotbugs/exclude.xml"))
    tasks.spotbugsMain {
        reports.create("html") {
            required.set(true)
        }
    }
    tasks.spotbugsTest {
        reports.create("html") {
            required.set(true)
        }
    }
}

tasks.withType<Javadoc> {
    setFailOnError(false)
    (options as StandardJavadocDocletOptions).addBooleanOption("Xdoclint:none", true)
    (options as StandardJavadocDocletOptions).addStringOption("Xmaxwarns", "1")
}