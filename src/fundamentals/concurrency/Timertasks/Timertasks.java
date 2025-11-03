package Timertasks;

import java.util.Timer;
import java.util.TimerTask;

public class Timertasks {
    public static void main(String[] args){
        // Timer = Class that schedules tasks at specific times or periodically
        //         usefull for: sending notifications, schedules updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the timer
        //             you will extend the TimeTask class to define your task
        //             create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 3;
            @Override
            public void run(){
                System.out.println("Hello!");
                count--;
                if(count < 0){
                    System.out.println("Task completed");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);
    }
}
