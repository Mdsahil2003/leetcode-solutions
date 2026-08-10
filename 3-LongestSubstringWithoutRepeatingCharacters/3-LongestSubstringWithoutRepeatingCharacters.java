// Last updated: 8/10/2026, 10:34:32 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0, end = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while(end < s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                max = Math.max(max,end - low);
            }else{
                set.remove(Character.valueOf(s.charAt(low)));
                low++;
            }
        }
        return max;
    }
}