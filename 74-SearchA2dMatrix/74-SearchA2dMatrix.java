// Last updated: 8/10/2026, 10:33:25 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;    // Number of rows
        int n = matrix[0].length; // Number of columns
        
        int left = 0, right = m * n - 1;  // Treat 2D matrix as 1D array
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Convert mid index to matrix row and column
            int row = mid / n;
            int col = mid % n;
            int midValue = matrix[row][col];
            
            if (midValue == target) {
                return true;  // Target found
            } else if (midValue < target) {
                left = mid + 1;  // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        
        return false;  // Target not found
    }
}
