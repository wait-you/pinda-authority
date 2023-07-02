plugins {
    id("java")
    id("org.springframework.boot")
}

description = "核心模块"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-bootstrap")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-discovery")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-config")
    implementation("cn.hutool:hutool-all")
    implementation("org.slf4j:slf4j-api")
    implementation("com.alibaba:fastjson")
    implementation("com.google.guava:guava")
}
