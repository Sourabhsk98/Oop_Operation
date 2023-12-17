package com.example.encapsulation;
import java.util.Scanner;

    public class Animal {
        private String name;
        private int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Encapsulation: Getter methods for private properties
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

    }
