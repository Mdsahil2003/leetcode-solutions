// Last updated: 8/10/2026, 10:31:41 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int largest = nums[0]; 
        for(int i = 0 ; i < n - k + 1 ; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}