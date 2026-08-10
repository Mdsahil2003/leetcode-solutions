// Last updated: 8/10/2026, 10:34:04 PM
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }

}
