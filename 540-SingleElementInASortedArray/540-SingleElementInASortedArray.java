// Last updated: 8/10/2026, 10:30:20 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end= nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid] == nums[mid + 1]){
                start = mid + 2;
            }else{
                end = mid;
            }
        }
        return nums[end]; // or nums[start]
    }
}