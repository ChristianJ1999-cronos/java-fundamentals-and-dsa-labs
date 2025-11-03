/*
testing ternary operators
 */
public class ternary {
    public static void main(String[] args){
        //ternary operator = Return 1 or 2 values if a condition is true
        //variable = (condition) ? ifTrue: ifFalse;

        int score = 75;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "even" : "odd";

        int hours = 10;
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

        int income = 20000;
        double taxbreak = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOfDay);
        System.out.println(taxbreak);

    }
}
