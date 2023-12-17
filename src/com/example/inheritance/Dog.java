package com.example.inheritance;
import com.example.encapsulation.Animal;
public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Encapsulation: Getter method for private property
    public String getBreed() {
        return breed;
    }

    // Encapsulation: Method to display additional information about the dog
    public void displayDogInfo() {
        System.out.println("Breed: " + breed);
    }

}

