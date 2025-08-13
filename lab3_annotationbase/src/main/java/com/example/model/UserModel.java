package com.example.model;

import org.springframework.stereotype.Component;

@Component // @Component คือการบอก Spring ว่า class นี้เป็น Bean ด้วยการกำหนด @Component
public class UserModel {
    private String name;
    private int age;

    public UserModel() {
    }

    public UserModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
    }

}
