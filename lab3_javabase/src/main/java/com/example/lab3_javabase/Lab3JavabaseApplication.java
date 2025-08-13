package com.example.lab3_javabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.model.Teacher;
import com.example.model.UserModel;

@SpringBootApplication
public class Lab3JavabaseApplication {

	public static void main(String[] args) {
		// * นายเอกวิชญ์ พิลาวรรณ 663380619-8 Section 4

		SpringApplication.run(Lab3JavabaseApplication.class, args);

		// ให้ใส่ class AppConfig
		try (var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			UserModel user = (UserModel) context.getBean("b_user"); // เอา Bean ID จาก AppConfig ที่กำหนด
			user.display();

			Teacher teacher = (Teacher) context.getBean("b_teacher");
			teacher.display();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
