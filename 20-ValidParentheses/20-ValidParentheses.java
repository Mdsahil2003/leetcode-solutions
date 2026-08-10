// Last updated: 8/10/2026, 10:34:14 PM
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // Check for matching closing brackets
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                // If no match is found, return false
                return false;
            }
        }

        // If the stack is empty, all brackets were matched
        return stack.isEmpty();
    }
}
