package DataStructures.BigO.Stack;
import java.util.Stack;

public class Stacking<S> {
    public static void main(String[] args){

        //stack = LIFO DS. Last in first out
        //        stores objects into a sort of "vertical tower"
        //        push() adds to the top
        //        pop() removes from the top

        // USES OF STACK?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        Stack<String> stack = new Stack<String>();

        stack.push("BO7");
        stack.push("skyrim");
        stack.push("minecraft");
        stack.push("overwatch");

//        System.out.println(stack.empty());

        System.out.println("1: " + stack);

//        stack.pop();
//        stack.pop();

        System.out.println(stack);
//        String favGame = stack.pop();

        System.out.println(stack.peek());
//        System.out.println(favGame);

        System.out.println(stack.search("overwatch"));
        System.out.println(stack.search("BO7"));

    }
}
