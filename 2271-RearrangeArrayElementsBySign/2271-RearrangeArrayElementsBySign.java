// Last updated: 8/10/2026, 10:29:26 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n =  nums.length;
        int[] news = new int[n];

        int pos  = 0;
        int neg = 1;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                news[pos] = nums[i];
                pos += 2;
            }else{
                news[neg] = nums[i];
                neg += 2;
            }
        }
        return news;
    }
}

