package Stacks;

import java.util.Stack;

public class Operations {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        //add
        st.push(10);
        st.push(30);
        st.push(100);
        st.push(21);

        //peek
        System.out.println(st.peek());

        //remove
        System.out.println(st.pop());

        //size
        System.out.println(st.size());

    }
}
