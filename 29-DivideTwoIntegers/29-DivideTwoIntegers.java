// Last updated: 8/10/2026, 10:33:46 PM
class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: Overflow when dividing Integer.MIN_VALUE by -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Get the signs and work with positive numbers
        boolean negative = (dividend < 0) ^ (divisor < 0); // XOR: True if signs are different
        long absDividend = Math.abs((long) dividend); // Convert to long to handle edge cases
        long absDivisor = Math.abs((long) divisor);

        int quotient = 0;

        // Subtract using bitwise shifting
        while (absDividend >= absDivisor) {
            long temp = absDivisor, multiple = 1;
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            absDividend -= temp;
            quotient += multiple;
        }

        // Apply the sign
        return negative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.divide(10, 3));  // Output: 3
        System.out.println(solution.divide(7, -3));  // Output: -2
        System.out.println(solution.divide(-2147483648, -1));  // Output: 2147483647
    }
}
