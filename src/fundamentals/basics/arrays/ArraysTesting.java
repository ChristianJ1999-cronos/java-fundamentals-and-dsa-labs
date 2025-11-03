import java.util.Arrays;
import java.util.Scanner;

public class ArraysTesting {
    public static void main(String[] args){

        //testing the arrays from scratch

        //array = a collection of values of the same data type
        //think of it as a variable that can store more than 1 value

//        String[] fruit = {"apple", "orange", "banana", "coconut"};
////        System.out.println(fruit[0]);
////
////        fruit[0] = "pineapple";
////        int numOfFruits = fruit.length;
////        System.out.println(numOfFruits);
////
////        for(int i = 0; i < fruit.length; i++){
////            System.out.print(fruit[i] + " ");
////        }
////
////        System.out.println();
////        System.out.println();
//
//        Arrays.sort(fruit); //sorts the array
//        Arrays.fill(fruit, "pineapple");
//
//        for(String fruits : fruit ){
//            System.out.print(fruits + " ");
//        }

        //entering user input into array
//        Scanner scanner = new Scanner(System.in);
//
//        String[] cars;
//        int numCars;
//
//        System.out.print("What # of cars would you like to display: ");
//        numCars = scanner.nextInt();
//        scanner.nextLine();
//
//        cars = new String[numCars];
//
////        cars[0] = "buggatti";
////        cars[1] = "audi";
////        cars[2] = "mercedes";
//
//        for(int i = 0; i < cars.length; i++){
//            System.out.print("Enter a car: ");
//            cars[i] = scanner.nextLine();
//        }
//
//        for(String car: cars){
//            System.out.println(car);
//        }
//
//        System.out.println(cars.length);
//        scanner.close();


        //how to search through an array
        Scanner scanner = new Scanner(System.in);


        int[] nums = {1,9,2,8,3,5,4};
        String[] fruits = {"apple", "orange", "watermelon", "grape"};
        int target = 9;


        System.out.print("Please select one of these fruits ( apple, orange, watermelon, grape ): ");
        String stringMatch = scanner.nextLine();
        boolean stringFound = false;
        boolean isFound = false;

        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        for(int ptr = 0; ptr < fruits.length; ptr++){
            if(fruits[ptr].equals(stringMatch)){
                System.out.println("Fruit was found in index: " + ptr);
                stringFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element was never found in the array!");
        }

        if(!stringFound){
            System.out.println("Fruit was not found in the array!");
        }

        scanner.close();

    }
}
