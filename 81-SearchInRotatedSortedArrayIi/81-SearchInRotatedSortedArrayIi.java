// Last updated: 8/10/2026, 10:33:06 PM
class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int start  = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target ){
                return true;
            }
            if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}