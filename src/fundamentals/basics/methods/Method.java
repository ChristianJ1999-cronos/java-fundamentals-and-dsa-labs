/*
testing methods
 */

public class Method {
    public static void main(String[] args){
        //method = a block of reusable code that is executed when called ()
        String name = "Cronos";
        int age = 26;

//        happyBirthday(name, age);
//        happyBirthday(name, age);
//        happyBirthday(name, age);
//        happyBirthday(name, age);


//        double result = square(3);
//        System.out.println(result);

//        double cubedResult = cube(3);
//        System.out.println(cubedResult);

//        String fullName = getFullName("Cronos", "Jimenez");
//        System.out.println(fullName);

        age = 12;
        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }else{
            System.out.println("you must be 18+ to sign up!");
        }
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you \n");
    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number*number*number;
    }

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}
