package com.example.dsa.array.tuf.easy;

import java.util.HashSet;
import java.util.Set;

public class A04RemoveDublicate {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
       // System.out.println(removeDublicate(arr));
        System.out.println(removeDublicate2(arr));
    }

    public static int removeDublicate(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(Integer i : arr){
            set.add(i);
        }

        int index = 0;
        for (Integer i : set){
            arr[index] = i;
            index++;
        }
        print(arr,index);
        return index;
    }

    public static int removeDublicate2(int arr[]){
        int n = arr.length;
        int i=0;
        for(int j = 1; j<n; j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        print(arr,i+1);
        return i+1;
    }

    public static void print(int arr[],int index){
        for (int i=0; i<index; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
