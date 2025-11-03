package RuntimePolymorphism;

import java.util.Scanner;

public class RuntimePoly {
    public static void main(String[] args){
        //  runtime polymorphism = When the method that gets exectuted is decided at runtime based on the actual type of the obj.

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.speak();
        cat.speak();

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
    }
}
