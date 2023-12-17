package com.example.abstraction;

public class DogSound implements AnimalSound {
    @Override
    public void makeSound() {
        System.out.println(" barks");
    }
}
