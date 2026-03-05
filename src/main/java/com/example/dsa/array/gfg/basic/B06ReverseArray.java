package com.example.dsa.array.gfg.basic;

public class B06ReverseArray {
    public static void main(String[] args) {
        int arr[]={1, 4, 3, 2, 6, 5};
        reverse(arr);
    }

    public static void reverse(int arr[]){
        int n=arr.length-1;
        for(int i=n; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
