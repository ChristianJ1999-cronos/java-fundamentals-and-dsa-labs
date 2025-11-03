package DataStructures.BigO.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){
        // QUEUE = FIFO, first in first out
        //         a collection designed for holding elements prior to processing
        //         Linear data structure

        //         add = enqueue-> offer()
        //         remove = dequeue-> poll()

        //WHEN ARE QUEUES USEFUL?
        // 1. Keyboard buffer (letters should appear on the screen in the order they are pressed)
        // 2. Printer DataStructures.BigO.Queue (Print jobs should be completed in order)
        // 3. Used in DataStructures.BigO.LinkedLists, PriorityQueues, Breadth-first search

        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

//        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);
    }
}
