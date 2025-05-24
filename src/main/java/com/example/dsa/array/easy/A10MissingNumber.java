package com.example.dsa.array.easy;

public class A10MissingNumber {
    public static void main(String[] args) {
        int n= 5;
        int arr[] = {1, 2, 4, 5};
        int i = missingNumber(arr,n);
        System.out.println(i);

    }

    public static int missingNumber(int arr[], int n){
        int sum = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0; i<n-1; i++){
            sum2 = sum2 + arr[i];
        }
        return sum-sum2;
    }


}
