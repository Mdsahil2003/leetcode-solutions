// Last updated: 8/10/2026, 10:29:23 PM
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            if (!isPalindromic(convertToBase(n, base))) {
                return false;
            }
        }
        return true;
    }
    
    private String convertToBase(int n, int base) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % base);
            n /= base;
        }
        return sb.reverse().toString();
    }
    
    private boolean isPalindromic(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.isStrictlyPalindromic(9)); // false
        System.out.println(solution.isStrictlyPalindromic(4)); // false
    }
}
