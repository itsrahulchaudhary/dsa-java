package com.example.dsa.array.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class A09Union {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        //System.out.println(findUnion(arr1,arr2));
        System.out.println(findUnion2Pointer(arr1,arr2));
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        for (int i=0; i<n; i++){
            set.add(arr1[i]);
        }
        for (int j=0; j<m; j++){
            set.add(arr2[j]);
        }
        union.addAll(set);
        return union;
    }

    public static ArrayList<Integer> findUnion2Pointer(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int i=0, j=0;
        ArrayList<Integer> union = new ArrayList<>();
        while (i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(union.size() == 0 || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }else{
                if(union.size() == 0 || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i<n){
            if(union.size() == 0 || union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }

        while (j<m){
            if(union.size() == 0 || union.get(union.size()-1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}
