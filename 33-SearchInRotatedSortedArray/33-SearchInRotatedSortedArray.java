// Last updated: 8/10/2026, 10:33:50 PM
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            }

            // Check if the left half is sorted
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; // Search in left half
                } else {
                    start = mid + 1; // Search in right half
                }
            }
            // Otherwise, the right half must be sorted
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; // Search in right half
                } else {
                    end = mid - 1; // Search in left half
                }
            }
        }
        return -1; // Target not found
    }
}
