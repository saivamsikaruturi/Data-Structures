package Stacks;

import java.util.Stack;

public class TappingRain {
    public static void main(String[] args) {
        int[] array = {4,2,0,6,2,5};
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i =0;i<array.length;i++){

            while(!st.isEmpty() && (array[st.peek()]<array[i]))
            {
                int popHeight = array[st.peek()];
                st.pop();
                if(st.isEmpty())
                    break;;
                int distance = i-st.peek()-1;
                int minHeight = Math.min(array[i],array[st.peek()])-popHeight;
                ans+= distance*minHeight;

            }
            st.push(i);
        }
        System.out.println(ans);
    }
}
