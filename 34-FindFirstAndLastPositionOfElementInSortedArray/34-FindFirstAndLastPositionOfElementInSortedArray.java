// Last updated: 8/10/2026, 10:33:43 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = fromLeft(nums, target);
        int end = fromRight(nums, target);
        return new int[]{start, end};
    }

    // Find the first occurrence of target
    private int fromLeft(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;  // Store the found index
                right = mid - 1;  // Continue searching on the left
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    // Find the last occurrence of target
    private int fromRight(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;  // Store the found index
                left = mid + 1;  // Continue searching on the right
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}
