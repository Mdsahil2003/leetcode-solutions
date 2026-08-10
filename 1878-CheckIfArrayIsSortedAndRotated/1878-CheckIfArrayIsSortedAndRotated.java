// Last updated: 8/10/2026, 10:29:27 PM
public class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) return false;  // More than one drop → not sorted+rotated
        }
        return true;
    }
}