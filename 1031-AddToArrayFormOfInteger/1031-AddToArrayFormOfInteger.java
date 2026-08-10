// Last updated: 8/10/2026, 10:29:54 PM
import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) k += num[i--]; // Add digit from array if available
            result.add(k % 10); // Get last digit
            k /= 10; // Remove last digit
        }

        Collections.reverse(result); // Reverse to get correct order
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num = {1, 2, 3, 4}; // 1234
        int k = 60;

        System.out.println(sol.addToArrayForm(num, k)); // Output: [1, 2, 9, 4]
    }
}
