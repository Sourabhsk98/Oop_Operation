package com.example.inheritance;
import com.example.encapsulation.Animal;
public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    // Encapsulation: Getter method for private property
    public String getColor() {
        return color;
    }

    // Encapsulation: Method to display additional information about the cat
    public void displayCatInfo() {
        System.out.println("Color: " + color);
    }


}
