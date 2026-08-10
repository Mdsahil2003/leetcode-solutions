// Last updated: 8/10/2026, 10:33:08 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min1 = prices[0];
        int max1 = 0;
        for(int i = 0 ; i < prices.length ; i++){
            int sum = prices[i] - min1;
            max1 = Math.max(max1 , sum);
            min1 = Math.min(min1 , prices[i]);
        }
        return max1;
    }
}