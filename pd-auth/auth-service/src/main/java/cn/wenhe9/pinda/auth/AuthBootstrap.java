package cn.wenhe9.pinda.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: 权限引导程序
 * @author: DuJinliang
 * @create: 2023/7/9
 */
@ComponentScan("cn.wenhe9.pinda")
@SpringBootApplication
public class AuthBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(AuthBootstrap.class, args);
    }
}
