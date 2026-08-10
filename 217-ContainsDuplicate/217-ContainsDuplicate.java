// Last updated: 8/10/2026, 10:31:48 PM
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) { // If already present, return true
                return true;
            }
            set.add(num); // Add element to HashSet
        }
        
        return false; // No duplicates found
    }
}
