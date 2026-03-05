package com.example.dsa.array.gfg.basic;

public class B05SubArray {
    public static void main(String[] args) {
        int arr[]={1, 2, 3};
        generateSubArray(arr);
    }

    public static void generateSubArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for (int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
