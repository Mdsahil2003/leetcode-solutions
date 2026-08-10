// Last updated: 8/10/2026, 10:33:28 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0 ; i < nums.length ; i++){
        
            count += nums[i];
            maxsum = Math.max(maxsum,count);
            if(count < 0){
                count = 0;
            }
        }
        return maxsum;
    }
}