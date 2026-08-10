// Last updated: 8/10/2026, 10:29:51 PM
class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        
        // Base cases: single pile situations
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }
        
        // Fill the DP table
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
            }
        }
        
        return dp[0][n - 1] > 0;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int[] piles1 = {5, 3, 4, 5};
        System.out.println(solution.stoneGame(piles1)); // true
        
        int[] piles2 = {3, 7, 2, 3};
        System.out.println(solution.stoneGame(piles2)); // true
    }
}
