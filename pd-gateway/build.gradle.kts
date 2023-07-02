plugins {
    id("java")
    id("org.springframework.boot")
}

description = "网关服务"

dependencies {
    implementation(project(":pd-core")) {
        exclude("org.springframework.boot", "spring-boot-starter-web")
    }
    implementation("org.springframework.cloud:spring-cloud-starter-gateway")
}
