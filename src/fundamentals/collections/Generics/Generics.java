package Generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args){
        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

      Box<Integer> box = new Box();
      box.setItem(63514);

      System.out.println(box.getItem());

      Product<String, Double> product1 = new Product("apple", .50);
        Product<String, Integer> product2 = new Product("apple", 15 );

        System.out.println(product1.getPrice());
        System.out.println(product2.getPrice());
    }
}
