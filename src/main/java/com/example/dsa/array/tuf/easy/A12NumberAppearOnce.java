package com.example.dsa.array.tuf.easy;

import java.util.HashMap;

// Find the number that appears once, and other numbers twice.
public class A12NumberAppearOnce {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(
               // numberAppearOnceBF(arr)
                numberAppearOnceBF2(arr)
        );
    }

    public static int numberAppearOnceBF(int arr[]){
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1)
                return num;
        }
        return -1;
    }

    public static int numberAppearOnceBF2(int arr[]){
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value+1);
        }

        map.forEach((k,v)->{
            if(v==1){
                System.out.println(k);
            }
        });
        return -1;
    }

}
