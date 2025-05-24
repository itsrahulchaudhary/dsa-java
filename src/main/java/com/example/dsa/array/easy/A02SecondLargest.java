package com.example.dsa.array.easy;

public class A02SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5,6};
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
        int secondSmallest = secondSmallest(arr);
        System.out.println(secondSmallest);
    }

    public static int secondLargest(int arr[]){
        int n = arr.length;
        if(n<2)
            return-1;
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }else if(arr[i]>slargest && arr[i]!=largest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static int secondSmallest(int arr[]){
        int n = arr.length;
        if(n<2)
            return -1;
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;
        for(int i=0;i<n; i++){
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] <ssmallest && arr[i]!=smallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
}
