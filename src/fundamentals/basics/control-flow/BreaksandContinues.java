/*
testing breaks and continues in for loops
 */

public class BreaksandContinues {
    public static void main(String[] args){
        //break = break out of a loop (STOP)
        //continue = skip the current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            if(i == 8){
                break;
            }
            System.out.println(i + " ");
        }
    }
}
