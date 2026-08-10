// Last updated: 8/10/2026, 10:32:37 PM
class Solution {
    public String reverseWords(String s) {
    StringBuilder reverse = new StringBuilder();
    String[] word = s.trim().split(" +");

    for(int i = word.length - 1 ; i >= 0 ; i--){
        reverse.append(word[i]);
        reverse.append(" ");
    }
    return reverse.toString().trim();
}

}