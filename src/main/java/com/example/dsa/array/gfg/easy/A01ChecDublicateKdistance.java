package com.example.dsa.array.gfg.easy;

import java.util.HashSet;

public class A01ChecDublicateKdistance {
    public static void main(String[] args) {
        int k = 3;
        int arr[] = {1, 2, 3, 1, 4, 5};
        System.out.println(checkDublicateKdistance(arr,k));
    }

    public static boolean checkDublicateKdistance(int arr[], int k){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(hs.contains(arr[i])){
                return true;
            }
            hs.add(arr[i]);
            if(i>=k){
                hs.remove(arr[i-k]);
            }
        }
        return false;
    }
}
