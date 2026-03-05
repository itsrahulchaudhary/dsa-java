package com.example.dsa.array.gfg.easy;

import java.util.HashMap;

// Count Distinct Elements in every Window of size k
public class A01CountDistinctElement {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,3,1,1,3};
        int k=4;
        countDistinctElement(arr,k);
    }

    public static void countDistinctElement(int arr[], int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.print(map.size()+" ");
        for(int i=k; i<arr.length; i++){
            if(map.get(arr[i-k])==1){
                map.remove(arr[i-k]);
            }else {
                map.put(arr[i-k], map.getOrDefault(arr[i-k],0)-1);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            System.out.print(map.size()+" ");
        }
    }
}
