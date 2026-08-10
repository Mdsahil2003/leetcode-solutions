// Last updated: 8/10/2026, 10:34:26 PM
class Solution {
    public static int reverse(int x) {
        int reverse = 0;

        while (x != 0) {  // Handle negative numbers as well
            int digit = x % 10;
            
            // Check for overflow before updating reverse
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;  // Return 0 in case of overflow
            }

            reverse = (reverse * 10) + digit;
            x /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x)); // Output: 321

        int y = -456;
        System.out.println(reverse(y)); // Output: -654

        int z = 1534236469;  // This would cause an overflow
        System.out.println(reverse(z)); // Output: 0
    }
}
