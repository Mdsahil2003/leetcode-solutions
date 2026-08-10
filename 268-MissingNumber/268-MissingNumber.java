// Last updated: 8/10/2026, 10:31:11 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualsum = n * (n + 1)/2;
        int sum = 0;

        for(int num : nums){
            sum +=num;
        }
        return actualsum - sum;
    }
}
