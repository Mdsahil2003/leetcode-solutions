// Last updated: 8/10/2026, 10:30:36 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false; // Negative numbers and 0 are not powers of 4
        
        while (n % 4 == 0) { // Keep dividing by 4 while n is a multiple of 4
            n /= 4;
        }

        return n == 1; // If we reach 1, n is a power of 4
    }
}
