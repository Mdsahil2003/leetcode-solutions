// Last updated: 8/10/2026, 10:32:28 PM
class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

           // boolean name = arr[start] < arr[end];
            if(nums[mid] > nums[end]){
                start = mid+1;
            }else{
                end = mid;
            }

        }
        return nums[start];
    }
}