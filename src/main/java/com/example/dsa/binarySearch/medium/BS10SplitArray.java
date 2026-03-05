package com.example.dsa.binarySearch.medium;

import java.util.Arrays;

public class BS10SplitArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;
        System.out.println(
                largestSubarraySumMinimizedBS(arr,k)
        );
    }

    public static int largestSubarraySumMinimized(int arr[], int k){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int n : arr){
            maxi=Math.max(maxi,n);
            sum+=n;
        }
        for(int i=maxi; i<=sum; i++){
            if (countPartitions(arr, i) == k) {
                return i;
            }
        }
        return -1;
    }

    public static int largestSubarraySumMinimizedBS(int[] a, int k) {
        int low = Arrays.stream(a).max().getAsInt(); // largest element
        int high = Arrays.stream(a).sum(); // sum of all elements

        // Binary search for the smallest maxSum
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(a, mid);

            if (partitions > k) {
                low = mid + 1; // too many partitions → increase maxSum
            } else {
                high = mid - 1; // valid but try smaller maxSum
            }
        }
        return low;
    }

    public static int countPartitions(int arr[], int maxSum){
        int partitions =1;
        int subarraySum =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]+subarraySum <=maxSum){
                subarraySum +=arr[i];
            }else {
                partitions ++;
                subarraySum =arr[i];
            }
        }
        return partitions;
    }
}
