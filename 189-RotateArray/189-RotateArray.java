// Last updated: 8/10/2026, 10:32:05 PM

class Solution{
    public void rotate(int[] num,int k){
        int n = num.length;
        k = k % n;
         reverse(num, 0, n - 1);
        // Reverse first k elements
        reverse(num, 0, k - 1);
        // Reverse remaining elements
        reverse(num, k, n - 1);

    }
        public void reverse(int[] arr, int start, int end){
            while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        }
    }
