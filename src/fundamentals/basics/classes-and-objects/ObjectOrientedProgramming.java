import java.util.Random;
import java.util.Scanner;

public class ObjectOrientedProgramming {
    public static void main(String[] args){
        // object = An entity that holds data (attribute) and can perform actions (methods)
        // it is a reference data type

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
//        car.isRunning = true; // makes is running true
//        System.out.println(car.isRunning);

        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();

        Car car2 = new Car();
        System.out.println(car.make + " " + car.model);
        System.out.println(car2.make + " " + car2.model);

    }
}
