/*
testing with random numbers again
 */
import java.util.Random;

public class RandomNum {
    public static void main(String[] args){
        Random random = new Random();

        double num1;
        boolean num2;
        int num3;

        num1 = random.nextDouble(1,101); //bound between first and second num but will never get the second num
        num2 = random.nextBoolean();
        num3 = random.nextInt(1,101);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
