package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    private Queue<Integer> queue;

    public ImplementStackUsingQueues() {
        queue = new LinkedList<>();
    }
    public void push(int x) {
        int size = queue.size();
        queue.offer(x);
        for (int i = 0; i < size; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
