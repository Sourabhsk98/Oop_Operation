package UserInput;
import com.example.encapsulation.Animal;
import com.example.inheritance.Dog;
import com.example.inheritance.Cat;
import com.example.abstraction.DogSound;
import com.example.abstraction.AnimalSound;
import com.example.abstraction.CatSound;
import  com.example.Polymophism.AnimalService;
import java.util.Scanner;

public class userInputexample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
             while(true) {


                 System.out.println("Choose an example:");
                 System.out.println("1. Encapsulation");
                 System.out.println("2. Inheritance");
                 System.out.println("3. Polymorphism");
                 System.out.println("4. Abstraction");

                 int choice = scanner.nextInt();
                 scanner.nextLine();


                 switch (choice) {
                     case 1:
                         // Encapsulation example
                         System.out.print("Enter the name of the animal: ");
                         String animalName = scanner.next();
                         System.out.print("Enter the age of the animal: ");
                         int animalAge = scanner.nextInt();
                         Animal animal = new Animal(animalName, animalAge);
                         animal.displayInfo();
                         break;

                     case 2:
                         // Inheritance example
                         System.out.print("Enter the name of the dog: ");
                         String dogName = scanner.next();
                         System.out.print("Enter the age of the dog: ");
                         int dogAge = scanner.nextInt();
                         System.out.print("Enter the breed of the dog: ");
                         String dogBreed = scanner.next();
                         Dog dog = new Dog(dogName, dogAge, dogBreed);
                         dog.displayInfo();
                         dog.displayDogInfo();

                         System.out.print("Enter the name of the cat: ");
                         String catName = scanner.next();
                         System.out.print("Enter the age of the cat: ");
                         int catAge = scanner.nextInt();
                         System.out.print("Enter the color of the cat: ");
                         String catColor = scanner.next();
                         Cat cat = new Cat(catName, catAge, catColor);
                         cat.displayInfo();
                         cat.displayCatInfo();
                         break;

                     case 3:
                         // Polymorphism example
                         AnimalService animalService = new AnimalService();

                         // Create instances of Dog and Cat
                         Dog myDog = new Dog("Buddy", 3, "Labrador");
                         Cat myCat = new Cat("Whiskers", 2, "White");

                         // Demonstrate polymorphic behavior by passing animals to the method
                         animalService.displayAnimalInfo(myDog);
                         System.out.println();
                         animalService.displayAnimalInfo(myCat);
                         break;

                     case 4:
                         // Abstraction example
                         System.out.println("Choose an animal sound:");
                         System.out.println("1. Dog");
                         System.out.println("2. Cat");
                         int soundChoice = scanner.nextInt();

                         AnimalSound animalSound;

                         // Demonstrate abstraction by creating instances of DogSound and CatSound
                         if (soundChoice == 1) {
                             animalSound = new DogSound();
                         } else if (soundChoice == 2) {
                             animalSound = new CatSound();
                         } else {
                             System.out.println("Invalid choice");
                             return;
                         }

                         // Call the makeSound method on the chosen animal sound
                         animalSound.makeSound();
                         break;

                     default:
                         System.out.println("Invalid choice");
                 }
             }

    }finally{
        scanner.close();
         }

    }
}