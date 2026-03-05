package com.example.dsa.array.gfg.basic;

import java.util.ArrayList;

public class B02Leader {
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
        System.out.println(
                leader(arr)
        );
    }

    public static ArrayList<Integer> leader(int arr[]){
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
             boolean leader = true;
             for(int j=i+1; j<arr.length; j++){
                 if(arr[i]<arr[j]){
                     leader=false;
                     break;
                 }
             }
             if(leader){
                 res.add(arr[i]);
             }
        }
        return res;
    }


}

