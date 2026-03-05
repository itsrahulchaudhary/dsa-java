package com.example.dsa.array.gfg.basic;

public class B03IsSorted {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        System.out.println(
                isSorted(arr)
        );
    }

    public static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
