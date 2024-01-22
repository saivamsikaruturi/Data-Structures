package Stacks;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// User function Template for Java

class RemoveKDigits {
    public static void main(String[] args) {
        System.out.println(removeKdigits("143298", 3));
    }

    public static String removeKdigits(String S, int K) {
        if (K >= S.length()) return "0";

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < S.length(); i++) {

            while (!st.isEmpty() && st.peek() > S.charAt(i) && K > 0) {
                K--;
                st.pop();
            }
            if (st.isEmpty() && S.charAt(i) == '0')
                continue;
            st.push(S.charAt(i));

        }


        while (K > 0 && !st.isEmpty()) {
            st.pop();
            K--;
        }
        if (st.size() == 0)
            return "0";

        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }
}