// Last updated: 8/10/2026, 10:31:33 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;            
        }
        // while(n%2==0){
        //     n/=2;
        // }
        return (n & (n - 1)) == 0;
    }
}