package Threading;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Thread was interrupted!");
            }

            if(i == 10){
                System.out.println("Times up!");
                System.exit(0); //adding this ends the code when the timer finishes after the counter reaches the 10 seconds or whatever number we chose
            }

        }
    }
}
