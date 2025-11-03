import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // java rerun course
        /*
        System.out.println("Hello World");
        System.out.print("Hello Cronos");
        System.out.println("Remember to easily have the out put here in intellij just type sout and press enter and itll type it for you!");
        */
        /*
        int age = 30;
        System.out.println(age);
        double money = 20.25;
        System.out.println("The amount of money we have is: " + money);
        char initial = 'C';
        System.out.println(initial);
        boolean isStudent = false;
        if(isStudent){ //leave it like this just checks for if true
            System.out.println("first pass: " + isStudent);
        } else {
            System.out.println("second pass: " + isStudent);
        }

        String name = "Cronos";
        System.out.println("Hey whats sup " + name);
        */

        /*
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //nextLine reads spaces while next does not

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What was your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your are " + age + " years old");
        System.out.println("Your gpa last semester was: " + gpa);
        System.out.println("Student? " + isStudent);
        */

        /*
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("Your are " + age + " years old");
        System.out.println("Your favorite color is " + color);
        */


        //calculate the area of a rectangle
        /*
        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Please enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Please enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The are of the rectangle is: " + area + "cm");
         */

        scanner.close();
    }
}
