plugins {
    id("java-library")
    id("org.springframework.boot")
}

description = "核心模块"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web") {
        exclude("org.springframework.boot", "spring-boot-starter-tomcat")
    }
    implementation("org.springframework.boot:spring-boot-starter-undertow")
    implementation("org.springframework.cloud:spring-cloud-starter-bootstrap")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-discovery")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-config")
    implementation("com.github.xiaoymin:knife4j-spring-boot-starter")
    implementation("io.springfox:springfox-swagger") {
        exclude(group = "io.swagger", module = "swagger-models")
        exclude(group = "io.swagger", module = "swagger-annotations")
    }
    implementation("io.springfox:springfox-bean-validators")
    annotationProcessor ("org.springframework.boot:spring-boot-configuration-processor")
    implementation("cn.hutool:hutool-all")
    implementation("org.slf4j:slf4j-api")
    implementation("com.alibaba:fastjson")
    implementation("com.google.guava:guava")
}
