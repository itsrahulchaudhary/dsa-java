package com.example.dsa.array.tuf.easy;

public class A03CheckIsSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4};
        System.out.println(isSorted(arr));

    }

    public static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i])  // 2<1 - F  //  1<2 - T if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
}
