/*
testing different string methods
 */
public class StringMethods {
    public static void main(String[] args){
        String name = "Cronos Jimenez";
        int length = name.length();
        char letter = name.charAt(10);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");

        name = name.toUpperCase();

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);
//        name = name.trim(); //gets rid of all the white space

        name = name.replace("o", "a");
        System.out.println(name);

        System.out.println(name.isEmpty()); //can use in an if statement

        System.out.println(name.contains("c")); //can use in an if statement

        if(name.equals("password")){
            System.out.println("Your name can't be password");
        }else{
            System.out.println("Hello " + name);
        }

    }
}
