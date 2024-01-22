package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] arr, int n) {

        Stack<Integer> stack = new Stack<>();

        int[] result = new int[n];
        Arrays.fill(result, -1);

        for (int i = 0; i < n; i++) {

            if (stack.isEmpty()) {
                stack.push(i);
            } else {

                while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                    int index = stack.pop();
                    result[index] = arr[i];
                }
                stack.push(i);

            }
        }
        return result;

    }
}
