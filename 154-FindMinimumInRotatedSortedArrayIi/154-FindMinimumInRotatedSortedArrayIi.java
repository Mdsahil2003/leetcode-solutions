// Last updated: 8/10/2026, 10:32:26 PM
class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;  // Search in right half
            } else if (nums[mid] < nums[end]) {
                end = mid;  // Search in left half
            } else {
                end--;  // Handle duplicates by reducing search space
            }
        }
        
        return nums[start];
    }
}
