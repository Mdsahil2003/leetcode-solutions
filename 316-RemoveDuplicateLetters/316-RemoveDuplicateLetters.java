// Last updated: 8/10/2026, 10:31:07 PM
import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26]; // To store the frequency of characters
        boolean[] inStack = new boolean[26]; // To check if a character is already in the stack
        Stack<Character> stack = new Stack<>(); // Stack to store the result

        // Step 1: Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Step 2: Iterate through the string
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']--; // Decrease frequency (since we use this character now)

            // If character is already in the stack, skip it
            if (inStack[ch - 'a']) continue;

            // Step 3: Maintain lexicographical order
            while (!stack.isEmpty() && stack.peek() > ch && freq[stack.peek() - 'a'] > 0) {
                inStack[stack.pop() - 'a'] = false; // Remove from stack
            }

            // Step 4: Push current character into stack
            stack.push(ch);
            inStack[ch - 'a'] = true;
        }

        // Step 5: Convert stack to string
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicateLetters("bcabc")); // Output: "abc"
        System.out.println(solution.removeDuplicateLetters("cbacdcbc")); // Output: "acdb"
    }
}
