package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListing {
    public static void main(String[] args){
        //ArrayList = A resizeable array that stores objects (autoboxing).
        //            Arrays are fixed in size, but arrayList can change.


//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(4);
//        list.add(2);
//
//        System.out.println(list);
//
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("apple");
//        fruits.add("watermelon");
//        fruits.add("mango");
//        fruits.add("srawberry");
//
//        System.out.println(fruits);
//
////        fruits.remove(0); //deletes the current value
////        fruits.set(0, "melon"); //replaces the current value
//
//        System.out.println(fruits.get(1));
//        System.out.println(fruits.size());
//
//        Collections.sort(fruits);
//
//        System.out.println(fruits);
//
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like to store: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food number #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);

        }

        System.out.println(foods);

        scanner.close();
    }
}
