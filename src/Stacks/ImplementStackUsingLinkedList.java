package Stacks;

import java.util.*;

class StackNode {
    int data;
    StackNode next;

    StackNode(int a) {
        data = a;
        next = null;
    }
}


class ImplementStackUsingLinkedList {
    static StackNode top;

    //Function to push an integer into the stack.
    static void push(int a) {

        StackNode node = new StackNode(a);
        node.next = top;
        top = node;

    }

    //Function to remove an item from top of the stack.
    static int pop() {

        if (top == null) {
            return -1;
        }

        int topped = top.data;
        top = top.next;
        return topped;
    }

    public static void main(String[] args) {
        push(100);
        push(10);
        while (top != null) {
            System.out.print(top.data + "->");
            top = top.next;
        }

    }
}
