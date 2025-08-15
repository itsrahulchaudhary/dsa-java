package com.example.dsa.binarySearch.medium;

public class BS03KokoEatingBanana {
    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int h = 8;
        //int i = minimumRateToEatBananas(arr, h);
        int i = minimumRateToEatBananas2(arr, h);
        System.out.println(i);
    }

    // brute force
    public static int minimumRateToEatBananas(int arr[], int h){
        int maxi = maxFind(arr);
        for(int i=1; i<=maxi; i++){
            int hoursRequires = calHour(arr, i);
            if(hoursRequires<=h){
                return i;
            }
        }
        return maxi;
    }

    public static int minimumRateToEatBananas2(int arr[], int h){
        int maxi = maxFind(arr);
        int low = 1;
        int high = maxi;
        int ans= maxi;
        while (low<=high){
            int mid = low+(high-low)/2;
            int reqHours = calHour(arr,mid);
            if (reqHours<=h){
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }

    private static int calHour(int[] arr, int i) {
        int totalH=0;
        for (int v  : arr){
            totalH += Math.ceil((double)(v) / (double)(i));
        }
        return totalH;
    }

    private static int maxFind(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max,i);
        }
        return max;
    }
}
