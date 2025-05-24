package com.example.dsa.array.easy;

import java.util.ArrayList;
import java.util.List;

public class A07ZeroAtEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,0,5,1};
        //zeroAtEnd(arr);
        int[] arr1 = moveZero(arr);
        print(arr1);
    }

    public static int[] moveZero(int arr[]){
        int j=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) {
                j = i;
                break;
            }
        }

        for(int i=j+1; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }


    public static void zeroAtEnd(int arr[]){
      int n = arr.length;
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]!=0)
                temp.add(arr[i]);
        }
        for(int i = 0; i<temp.size(); i++){
            arr[i]=temp.get(i);
        }

        for (int i = temp.size(); i<n; i++){
            arr[i] = 0;
        }

        print(arr);

    }
    public static void print(int arr[]){
        for (Integer i : arr){
            System.out.print(i+" ");
        }
    }



}
