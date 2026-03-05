package com.example.dsa.array.gfg.basic;

public class B01Alternate {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        alternate(arr);
    }

    public static void alternate(int arr[]){
        for(int i=0; i<arr.length; i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
