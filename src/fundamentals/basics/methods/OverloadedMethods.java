/*
testing overloaded methods
 */

public class OverloadedMethods {
    public static void main(String[] args){
        //overloaded methods = methods that share the same name, but different parameters signature = name + parameters
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));

        String pizza1 = bakedPizza("sourdough");
        System.out.println(pizza1);
        String pizza2 = bakedPizza("sourdough", "pepper jack");
        System.out.println(pizza2);
        String pizza3 = bakedPizza("sourdough", "pepper jack", "pepperoni");
        System.out.println(pizza3);
    }

    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

    static String bakedPizza(String bread){
        return bread + " pizza";
    }

    static String bakedPizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }

    static String bakedPizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
