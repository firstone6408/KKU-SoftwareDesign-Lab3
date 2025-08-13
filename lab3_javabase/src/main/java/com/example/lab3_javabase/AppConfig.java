package com.example.lab3_javabase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Teacher;
import com.example.model.UserModel;

@Configuration
public class AppConfig {
    // การใช้ Bean แบบ JavaBase
    // Bean ID จะเป็นชื่อเดียวกับ Method ถ้าไม่กำหนด
    @Bean(name = "b_user") // กำหนด Bean ID
    UserModel user() {
        // Instace ตัวนี้จะสร้างใน IO Container ของ Spring
        return new UserModel("Ekkawich Pilawan", 140);
    }

    @Bean(name = "b_teacher")
    Teacher teacher() {
        // กำหนดค่าเริ่มต้นของ Teacher
        return new Teacher("T-001", "Nan", "0123456789");
    }
}
