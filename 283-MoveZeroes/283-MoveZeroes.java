// Last updated: 8/10/2026, 10:31:03 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        int n = nums.length;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[insertPos++] = nums[i];
            }
        }
        while(insertPos < n){
            nums[insertPos++] = 0;
        }
}
}
