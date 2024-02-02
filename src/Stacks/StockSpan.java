package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] array = {100,80,60,70,60,75,85};
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] result = new int[array.length];
        result[0]=1;
        for(int i =1;i<array.length;i++){
           while(!st.isEmpty() && array[st.peek()]<array[i]){
               st.pop();
           }
           result[i] = i-st.peek();
           st.push(i);
        }

        System.out.println(Arrays.toString(result));
    }
}
