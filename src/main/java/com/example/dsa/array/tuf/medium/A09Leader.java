package com.example.dsa.array.tuf.medium;

import java.util.ArrayList;

public class A09Leader {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        //leader(arr);
        leader2(arr);

    }

    public static ArrayList<Integer> leader(int arr[]){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            boolean leader = true;
            for (int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if (leader)
                ans.add(arr[i]);
        }

        for(int i : ans){
            System.out.print(i+" ");
        }
        System.out.println();
        return ans;
    }

    public static ArrayList<Integer> leader2(int arr[]){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i = n-1;i>=0; i--){
            if(arr[i]>maxi){
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi,arr[i]);
        }
        for(int i : ans){
            System.out.print(i+" ");
        }
        System.out.println();
        return ans;
    }
}
