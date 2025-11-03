package MethodOver;

public class Fish extends Animal{

    @Override //to let other devs know we are overriding
    void move(){
        System.out.println("This animal is swimming!");
    }
}
