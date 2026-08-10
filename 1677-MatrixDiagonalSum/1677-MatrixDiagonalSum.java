// Last updated: 8/10/2026, 10:29:42 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];               // Primary diagonal
            sum += mat[i][n - 1 - i];       // Secondary diagonal
        }
        
        // If matrix size is odd, subtract the center element as it gets added twice
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }
        
        return sum;
    }
}
