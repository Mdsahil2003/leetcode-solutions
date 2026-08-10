// Last updated: 8/10/2026, 10:32:53 PM
class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i: nums){
            num^=i;
        }
        return num;
    }
}