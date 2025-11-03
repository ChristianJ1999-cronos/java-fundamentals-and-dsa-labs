package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args){
        // Exceptions = An event that interrupts the normal flow of a program (Dividing by zero, file not found, mismatch input type)
        //              Surround any dangerous code with a try{} block
        //              try{}, catch{}, finally{}


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by ZERO");
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally { //finally will always execute no matter what. mostly used more cleanup
            System.out.println("This always executes");
        }


    }
}
