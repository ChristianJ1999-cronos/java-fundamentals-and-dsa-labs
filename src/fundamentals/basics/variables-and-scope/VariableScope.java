/*
testing variable scope
 */

public class VariableScope {
    static int x = 3; //CLASS variable

    public static void main(String[] args){
        //variable scope = where a variable can be accessed
        System.out.println(x);
        int x = 1; //LOCAL variable
        System.out.println(x);
        doSomething();

    }

    static void doSomething(){
        int x = 2; //LOCAL
        System.out.println(x);
    }
}
