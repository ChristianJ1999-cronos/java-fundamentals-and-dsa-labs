/*
testing enhanced switches
 */
import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args){

        //enhanced switch = a replacement to many else if statements => (java 14 feature)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine();


        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday");
            case "Saturday", "Sunday" -> System.out.println("It's a weekend");
            default -> System.out.println(day + " is not a day");
        }
        scanner.close();
    }
}
