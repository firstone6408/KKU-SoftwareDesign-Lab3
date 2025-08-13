package com.example.lab3_xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.UserModel;

@SpringBootApplication
public class Lab3XmlApplication {

	public static void main(String[] args) {
		// * นายเอกวิชญ์ พิลาวรรณ 663380619-8 Section 4

		SpringApplication.run(Lab3XmlApplication.class, args);

		// ระบ ตำแหน่งที่เก็บไฟล์ applicationContext.xml
		try (var context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			UserModel user = (UserModel) context.getBean("user"); // เอา Bean ID จาก applicationContext.xml
			user.display();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
