plugins {
    id("hu.bme.mit.ase.shingler.gradle.application")
}

dependencies {
    api(project(":logic"))

    implementation(libs.slf4j.api)
    implementation(libs.picocli)

    runtimeOnly(libs.slf4j.log4j.impl)

    testImplementation(libs.junit.jupiter.core )

    testRuntimeOnly(libs.junit.jupiter.engine)
}

application {
    mainClass = "hu.bme.mit.ase.shingler.similarity.SimilarityApp"
}
