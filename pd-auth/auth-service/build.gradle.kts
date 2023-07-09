plugins {
    id("java")
    id("org.springframework.boot")
}

description = "权限服务模块"

dependencies {
    implementation(project(":pd-core"))
}
