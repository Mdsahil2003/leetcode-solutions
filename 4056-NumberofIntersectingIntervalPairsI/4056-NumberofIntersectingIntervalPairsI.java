// Last updated: 9/24/2026, 5:20:53 PM
1class Solution {
2    public int countIntersectingIntervals(int[][] intervals) {
3        int n = intervals.length;
4        int count  = 0;
5        for(int i  = 0; i < n ; i++){
6            for(int j = i + 1 ; j < n ; j++){
7                if(intervals[i][0] <= intervals[j][1] && intervals[j][0] <= intervals[i][1]){
8                    count++;
9                }
10            }
11        }
12        return count;
13    }
14}