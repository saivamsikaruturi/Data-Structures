package Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Operations {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(100);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println("after removing peek"+queue.peek());
    }
}
