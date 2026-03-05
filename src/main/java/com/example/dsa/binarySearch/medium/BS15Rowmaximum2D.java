package com.example.dsa.binarySearch.medium;

public class BS15Rowmaximum2D {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1}, {1, 1, 1}, {0, 0, 0}};
        int n = 3, m = 3;
        System.out.println(
                rowWithMax1sBS(matrix,n,m)
        );
    }


    public static int rowWithMax1s(int matrix[][], int n, int m){
        int count_max=0;
        int index=-1;
        for(int i=0; i<n; i++){
            int count_ones=0;
            for(int j=0; j<m; j++){
                count_ones+=matrix[i][j];
            }
            if(count_ones>count_max){
                count_max=count_ones;
                index=i;
            }
        }
        return index;
    }

    public static int rowWithMax1sBS(int matrix[][], int n, int m){
       int count_max=0;
       int index=0;
       for(int i=0; i<n; i++){
           int count_ones=0;
           count_ones=m-lowerBound(matrix[i], 1);
           if(count_ones>count_max){
               count_max=count_ones;
               index=i;
           }
       }
       return index;
    }

    public static int lowerBound(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
