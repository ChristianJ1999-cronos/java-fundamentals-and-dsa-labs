package Threading;

import java.util.Scanner;

public class Threading {
    public static void main(String[] args){
        // Threading = allows a program to run multiple tasks simultaneously
        //             helps improve performance with time consuming operations
        //             (file I/O, network communication, or any background tasks)

        // How to create a thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interfance (better)

        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); //ends the thread when the main thread is over
        thread.start();
        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
