// Last updated: 8/10/2026, 10:30:56 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();

        for(int i : nums1){
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<>();

        for(int j : nums2){
            if(set1.contains(j)){
                set2.add(j);
        }
        }

       int[] res = new int[set2.size()];
       int h = 0;
        for (int k : set2) {
            res[h++] = k;
        }
        return res;
    }
}