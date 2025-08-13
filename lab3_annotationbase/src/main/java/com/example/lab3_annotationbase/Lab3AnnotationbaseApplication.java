package com.example.lab3_annotationbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.model.UserModel;

@SpringBootApplication
public class Lab3AnnotationbaseApplication {

	public static void main(String[] args) {
		// * นายเอกวิชญ์ พิลาวรรณ 663380619-8 Section 4

		SpringApplication.run(Lab3AnnotationbaseApplication.class, args);

		try (var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			UserModel user = (UserModel) context.getBean("b_user");
			user.display();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
