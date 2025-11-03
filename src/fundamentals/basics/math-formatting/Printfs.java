/*
testing all the different functions of printf
 */
public class Printfs {
    public static void main(String[] args){
        //printf() = is a method used to format output

        //%[flags][width][.precision][specifier-character]

//        String name = "Cronos";
//        char firstLetter = 'C';
//        int age = 26;
//        double height = 60.5;
//        boolean isEmployed = false;
//
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Starts with %c\n", firstLetter);
//        System.out.printf("Your age is %d\n", age);
//        System.out.printf("Your height: %f\n", height);
//        System.out.printf("are you employed?: %b\n", isEmployed);
//
//        System.out.printf("%s is %d years old", name, age);

        // + = output a plus for positove nums
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

//        double price1 = 9000.99;
//        double price2 = 1000000.15;
//        double price3 = -54000.01;
//
//        System.out.printf("% .2f\n", price1);
//        System.out.printf("% .2f\n", price2);
//        System.out.printf("% .2f\n", price3);

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified number

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);


    }
}
