import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

plugins {
    java
}

group = "cn.wenhe9"
version = "1.0.0 SNAPSHOT"
description = "品达通用权限系统父工程"

java {
    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
    tasks.withType<Javadoc> {
        options.encoding = "UTF-8"
    }

    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

buildscript {
    extra["springBootVersion"] = "3.0.0"
    extra["springCloudVersion"] = "2022.0.3"
    extra["springCloudAlibabaVersion"] = "2022.0.0.0-RC2"
    extra["lombokVersion"] = "1.18.2"
    extra["p6spyVersion"] = "3.9.1"
    extra["fastjsonVersion"] = "2.0.33"
    extra["druidVersion"] = "1.2.18"
    extra["mysqlVersion"] = "8.0.33"
    extra["mybatisPlusVersion"] = "3.5.3"
    extra["knife4jVersion"] = "3.0.3"
    extra["easyCaptchaVersion"] = "1.6.2"
    extra["fastdfsClientVersion"] = "1.27.2"
    extra["qiniuJavaSdkVersion"] = "7.13.1"
    extra["j2cacheVersion"] = "2.8.0-release"
    extra["jjwtVersion"] = "4.4.0"
    extra["qcloudsmsVersion"] = "1.0.6"
    extra["bceJavaSdkVersion"] = "0.10.262"
    extra["hutoolVersion"] = "5.8.19"
    extra["antisamyVersion"] = "1.7.3"
    extra["ip2regionVersion"] = "2.7.0"
    extra["bitwalkerVersion"] = "1.21"
    extra["guava"] = "32.0.0-jre"

    repositories {
        maven(url = "https://maven.aliyun.com/repository/public")
        maven(url = "https://mvnrepository.com")
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:${property("springBootVersion")}")
    }
}

allprojects {
    apply(plugin = "java")
    apply(plugin = "idea")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    repositories {
        maven(url = "https://maven.aliyun.com/repository/public")
        maven(url = "https://mvnrepository.com")
        mavenLocal()
        mavenCentral()
    }

    configure<DependencyManagementExtension> {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
            mavenBom("com.alibaba.cloud:spring-cloud-alibaba-dependencies:${property("springCloudAlibabaVersion")}")
        }
        dependencies {
            dependency("org.projectlombok:lombok:${property("lombokVersion")}")
            dependency("org.lionsoul:ip2region:${property("ip2regionVersion")}")
            dependency("eu.bitwalker:UserAgentUtils:${property("bitwalkerVersion")}")
            dependency("com.baomidou:mybatis-plus-boot-starter:${property("mybatisPlusVersion")}")
            dependency("com.alibaba:druid-spring-boot-starter:${property("druidVersion")}")
            dependency("com.alibaba:druid-spring-boot-starter:${property("druidVersion")}")
            dependency("p6spy:p6spy:${property("p6spyVersion")}")
            dependency("mysql:mysql-connector-java:${property("mysqlVersion")}")
            dependency("net.oschina.j2cache:j2cache-core:${property("j2cacheVersion")}")
            dependency("com.github.tobato:fastdfs-client:${property("fastdfsClientVersion")}")
            dependency("com.qiniu:qiniu-java-sdk:${property("qiniuJavaSdkVersion")}")
            dependency("com.github.xiaoymin:knife4j-spring-boot-starter:${property("knife4jVersion")}")
            dependency("com.auth0:java-jwt:${property("jjwtVersion")}")
            dependency("com.github.qcloudsms:qcloudsms:${property("qcloudsmsVersion")}")
            dependency("com.baidubce:bce-java-sdk:${property("bceJavaSdkVersion")}")
            dependency("org.owasp.antisamy:antisamy:${property("antisamyVersion")}")
            dependency("com.github.whvcse:easy-captcha:${property("easyCaptchaVersion")}")
            dependency("com.alibaba:fastjson:${property("fastjsonVersion")}")
            dependency("com.google.guava:guava:${property("guava")}")
            dependency("cn.hutool:hutool-all:${property("hutoolVersion")}")
        }
    }

    tasks.jar {
        enabled = true
        manifest.attributes["provider"] = "gradle"
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")

    dependencies {
        implementation("org.projectlombok:lombok")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }

    tasks.test {
        useJUnitPlatform()
    }
}



