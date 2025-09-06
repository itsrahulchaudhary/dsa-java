package com.example.dsa.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class A07RearrangeSign {
    public static void main(String[] args) {
       //  Varient -1
        int n = 4;
        int arr[]= {1,2,-4,-5};
       // rearrangeSign1(arr,n);
      //  rearrangeSign2(arr,n);
        //  Varient -2
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, -4, -5, 3, 4));
        rearrangeSign3(list);
    }
// Variety-1
    public static int[] rearrangeSign1(int arr[], int n){
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }else {
                pos.add(arr[i]);
            }
        }

        for(int i=0; i<n/2; i++){
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        }

        print(arr);
        return arr;
    }

    public static ArrayList<Integer> rearrangeSign2(int arr[], int n){
        int posIndex=0;
        int negIndex=1;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : arr) {
            ans.add(num);
        }
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                ans.set(negIndex,arr[i]);
                negIndex+=2;
            }else {
                ans.set(posIndex,arr[i]);
                posIndex+=2;
            }
        }
        print(ans);
        return ans;
    }


    //Variety-2

    public static ArrayList<Integer> rearrangeSign3(ArrayList<Integer> arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i=0; i<arr.size(); i++){
            if(arr.get(i)<0){
                neg.add(arr.get(i));
            }else {
                pos.add(arr.get(i));
            }
        }
        if(pos.size()<neg.size()){
            for(int i=0; i<pos.size(); i++){
                arr.set(2*i,pos.get(i));
                arr.set(2*i+1,neg.get(i));
            }
            int index = pos.size()*2;
            for(int i=pos.size(); i<neg.size(); i++){
                arr.set(index,neg.get(i));
                index++;
            }
        }else {
            for(int i=0; i<neg.size(); i++){
                arr.set(2*i,pos.get(i));
                arr.set(2*i+1,neg.get(i));
            }
            int index = neg.size()*2;
            for(int i=neg.size(); i<pos.size(); i++){
                arr.set(index,pos.get(i));
                index++;
            }
        }
        print(arr);
        return arr;
    }



    private static void print(int[] arr) {
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void print(ArrayList<Integer> arr) {
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
