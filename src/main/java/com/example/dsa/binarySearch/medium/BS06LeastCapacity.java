package com.example.dsa.binarySearch.medium;

public class BS06LeastCapacity {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int days=5;
     //   int least = leastCapacityToShipBF(arr, days);
        int least = leastCapacityToShip(arr, days);
        System.out.println(least);
    }

    public static int leastCapacityToShipBF(int arr[], int days){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i : arr){
            sum+=i;
            maxi=Math.max(maxi,i);
        }
        for(int c=maxi; c<=sum; c++){
            int daysReq=reqNoOfDays(arr, c);
            if(daysReq<=days){
                return c;
            }
        }
      return -1;
    }

    public static int leastCapacityToShip(int arr[], int days){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i : arr){
            sum+=i;
            maxi=Math.max(maxi,i);
        }
        int low=maxi;
        int high=sum;
        int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            int daysReq=reqNoOfDays(arr, mid);
            if(daysReq<=days){
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }

    public static int reqNoOfDays(int[] arr, int c) {
       int days=1;
       int load=0;
       for(int i=0; i<arr.length; i++){
           if(load+arr[i]>c){
               days=days+1;
               load=arr[i];
           }else {
               load+=arr[i];
           }
       }
       return days;

    }
}
