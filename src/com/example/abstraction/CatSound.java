package com.example.abstraction;

public class CatSound implements AnimalSound {
    @Override
    public void makeSound() {
        System.out.println(" meows");
    }
}
