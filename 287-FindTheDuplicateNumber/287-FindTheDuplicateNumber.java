// Last updated: 8/10/2026, 10:31:13 PM
import java.util.ArrayList;

class Solution {
    public int findDuplicate(int[] nums) {
        
    boolean[] seen = new boolean[nums.length];
    
    for(int i = 0 ; i < nums.length ; i++){
        if(seen[nums[i]]){
            return nums[i];
        }
        seen[nums[i]] = true;
    }
    return -1;
    }
}