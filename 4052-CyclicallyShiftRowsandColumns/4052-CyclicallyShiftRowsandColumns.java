// Last updated: 9/24/2026, 5:41:52 PM
1class Solution {
2    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
3
4        int[][] temp = new int[n][n];
5        for(int i = 0; i < n ; i++){
6            for(int j =  0 ; j < n ; j++){
7                int newcol = (j - rowShift[i] + n) % n;
8                temp[i][newcol] = grid[i][j];
9                }
10            }
11
12        int[][] ans = new int[n][n];
13        for(int j = 0; j < n ; j++){
14            for(int i =  0 ; i < n ; i++){
15                int newrow = (i - colShift[j] + n) % n;
16                ans[newrow][j] = temp[i][j];
17                }
18            }
19        return ans;
20        } 
21    }
22