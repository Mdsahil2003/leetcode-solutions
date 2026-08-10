// Last updated: 8/10/2026, 10:31:58 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Expand the window

            while (sum >= target) { // Shrink the window
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left]; 
                left++; 
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
