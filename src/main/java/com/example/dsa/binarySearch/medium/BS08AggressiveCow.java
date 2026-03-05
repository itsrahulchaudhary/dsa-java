package com.example.dsa.binarySearch.medium;

import java.util.Arrays;

public class BS08AggressiveCow {
    public static void main(String[] args) {
        int arr[]={0,3,4,7,9,10};
        int cows=4;
        System.out.println(
                distanceCowsBS(arr,cows)
        );
    }

    public static int distanceCows(int arr[], int cows){
        Arrays.sort(arr);
        int size = arr[arr.length-1]-arr[0];
        int ans=-1;
        for(int i=1; i<=size; i++){
            if(canWePace(arr,i,cows)){
                 ans=i;
            }
        }
        return ans;
    }

    public static int distanceCowsBS(int arr[], int cows){
        Arrays.sort(arr);
        int size = arr[arr.length-1]-arr[0];
        int ans=-1;
        int low=1;
        int high=size;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(canWePace(arr,mid,cows)){
              ans=mid;
              low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return ans;
    }

    private static boolean canWePace(int[] arr, int d, int cows) {
        int countCow=1;
        int last=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-last>=d){
               countCow++;
               last=arr[i];
            }
            if(countCow>=cows){
                return true;
            }
        }
        return false;
    }
}
