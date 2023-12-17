package com.example.Polymophism;
import com.example.encapsulation.Animal;
import com.example.inheritance.Cat;
import com.example.inheritance.Dog;
public class AnimalService {
    public void displayAnimalInfo(Animal animal) {
        animal.displayInfo();

        // Polymorphism: Check the type of animal and display additional information
        //@Override from userinput
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.displayDogInfo();
        //@Override from userinput
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.displayCatInfo();
        }
    }
}


