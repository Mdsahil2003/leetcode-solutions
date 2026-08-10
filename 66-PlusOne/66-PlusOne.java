// Last updated: 8/10/2026, 10:33:22 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // If the digit is not 9, just increment and return
                return digits;
            }
            digits[i] = 0; // If it's 9, turn it into 0 and continue
        }

        // If all digits were 9, we need an extra digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1; // First digit becomes 1, rest are 0 by default
        return result;
    }
}
