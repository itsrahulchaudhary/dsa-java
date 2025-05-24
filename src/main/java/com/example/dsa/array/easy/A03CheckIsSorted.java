package com.example.dsa.array.easy;

public class A03CheckIsSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4};
        System.out.println(isSorted(arr));

    }

    public static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1])  // 2<1 - F  //  1<2 - T
                return false;
        }
        return true;
    }
}
