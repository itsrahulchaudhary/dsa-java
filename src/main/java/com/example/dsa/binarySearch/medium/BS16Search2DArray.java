package com.example.dsa.binarySearch.medium;

public class BS16Search2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target=23;
        System.out.println(
                searchElementOptimize(matrix,target)
        );
    }

    public static boolean searchElementBF(int matrix[][], int target){
        int n =matrix.length; // Number of rows
        int m = matrix[0].length;    // Number of columns
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchElementBetter(int matrix[][], int target){
        for (int i=0; i<matrix.length; i++){
            if(binarySearch(matrix[i],target)){
                return true;
            }
        }
        return false;
    }

    public static boolean searchElementOptimize(int matrix[][], int target){
        int n = matrix.length;        // Number of rows
        int m = matrix[0].length;     // Number of columns
        int row = 0;           // Start at first row
        int col = m - 1;       // Start at last column (top-right)
        // Traverse while within matrix bounds
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Found target
            } else if (matrix[row][col] < target) {
                row++; // Move down
            } else {
                col--; // Move left
            }
        }
        return false; // Target not found
    }

    public static boolean binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        // Binary search loop
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return true; // Found target
            } else if (target > nums[mid]) {
                low = mid + 1; // Move to right half
            } else {
                high = mid - 1; // Move to left half
            }
        }
        return false; // Target not found
    }
}
