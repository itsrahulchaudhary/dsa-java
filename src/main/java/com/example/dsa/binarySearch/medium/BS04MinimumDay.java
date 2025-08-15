package com.example.dsa.binarySearch.medium;

public class BS04MinimumDay {
    public static void main(String[] args) {
      int arr[] ={7,7,7,7,13,11,12,7};
      int m = 2; // no of bookay
      int k = 3; // no of flower
        int i = roseGarden2(arr, m, k);
       // int i = roseGarden(arr, m, k);
        System.out.println(i);
    }

    public static int roseGarden(int arr[], int m, int k){
        int n = arr.length;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            mini = Math.min(mini,arr[i]);
            maxi = Math.max(maxi,arr[i]);
        }
        for(int i=mini; i<=maxi; i++){
            if(possible(arr, i, m,k)){
                return i;
            }
        }
        return -1;
    }

    public static int roseGarden2(int arr[], int m, int k){
        int n = arr.length;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            mini=Math.min(mini, arr[i]);
            maxi=Math.max(maxi,arr[i]);
        }
        int low = mini;
        int high = maxi;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(possible(arr,mid,m,k)){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }

    private static boolean possible(int[] arr, int days, int m, int k) {
        int n = arr.length;
        int count=0;
        int noOfB=0;
        for (int i=0; i<n; i++){
            if(arr[i]<=days){
                count++;
            }else {
                noOfB=noOfB+count/k;
                count=0;
            }
        }
        noOfB=noOfB+count/k;
        return noOfB>=m;
    }
}
