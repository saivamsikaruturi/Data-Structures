package Stacks;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if ((s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') || (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') || (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(')) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

