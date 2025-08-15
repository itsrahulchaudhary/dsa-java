package com.example.dsa.binarySearch.medium;

public class BS05SmallestDivisor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
      //  int i = smallestDivisor(arr, limit);
        int i = smallestDivisor2(arr, limit);
        System.out.println(i);
    }

    public static int smallestDivisor(int arr[], int limit){
        int n = arr.length;
        int maxi=Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            maxi = Math.max(maxi, arr[i]);
        }

        for (int d = 1 ; d<=maxi; d++){
            int sum = 0;
            for (int i = 0; i<n; i++){
                sum += Math.ceil((double)(arr[i]) / (double)(d));
            }
            if(sum<=limit)
                return d;
        }
        return -1;
    }

    public static int smallestDivisor2(int arr[], int limit){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            maxi=Math.max(maxi,arr[i]);
        }
        int low = 1;
        int high = maxi;
        while (low<=high){
            int mid = low+(high-low)/2;
            int sum = 0;
            for (int i = 0; i<n; i++){
                sum += Math.ceil((double)(arr[i]) / (double)(mid));
            }
            if(sum<=limit){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }
}
