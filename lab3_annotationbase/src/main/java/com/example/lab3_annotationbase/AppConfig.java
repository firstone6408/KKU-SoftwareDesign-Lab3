package com.example.lab3_annotationbase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.model.UserModel;

@Configuration
@ComponentScan("com.example.model")
/*
 * @ComponentScan คือการบอกให้ Spring ไปหา class ที่มี @Component อยู่ใน package
 * นั้นๆด้วย
 */
public class AppConfig {
    @Bean(name = "b_user")
    UserModel user() {
        return new UserModel("Ekkawich Pilawan", 140);
    }
}
