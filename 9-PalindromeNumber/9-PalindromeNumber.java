// Last updated: 8/10/2026, 10:34:42 PM
class Solution {
    public boolean isPalindrome(int n) { // Keep the function public
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = (reversed * 10) + digit;
            n /= 10;
        }
        return original == reversed;
    }
}
