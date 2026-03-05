package com.example.dsa.array.tuf.medium;

public class A04MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
       // int maxSum = maxSubArraySum1(arr, n);
       // int maxSum = maxSubArraySum2(arr, n);
        long maxSum = maxSubArraySum3(arr, n);
        System.out.println(maxSum);
    }

    // Brute force
    public static int maxSubArraySum1(int arr[], int n){
        int maxi=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum=sum+arr[k];
                }
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    }

    //better
    public static int maxSubArraySum2(int arr[], int n){
         int maxi=Integer.MIN_VALUE;
         for(int i=0; i<n; i++){
             int sum=0;
             for(int j=i; j<n; j++){
                 sum=sum+arr[j];
                 maxi=Math.max(maxi,sum);
             }
         }
         return maxi;
    }
    
    // optimal
    public static long maxSubArraySum3(int arr[], int n){
        long maxi = Long.MIN_VALUE;
        long sum=0;
        for(int i=0; i<n; i++){
            sum=sum+arr[i];

            if(sum>maxi)
                maxi=sum;

            if(sum<0)
                sum=0;
        }
        return maxi;
    }
}
