package com.example.dsa.array.gfg.basic;

import java.util.HashSet;

public class B04RemoveDublicate {
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 3, 4, 4, 4, 5, 5};
        System.out.println(
                removeDublicate(arr)
        );
    }

    public static int removeDublicate(int arr[]){
        HashSet<Integer> hs= new HashSet<>();
        int indx=0;
        for(int i: arr){
            if(!hs.contains(i)){
                hs.add(i);
                arr[indx++]=i;
            }
        }
        for(int p=0; p<indx; p++){
            System.out.print(arr[p]+" ");
        }
        System.out.println();
        return indx;
    }
}
