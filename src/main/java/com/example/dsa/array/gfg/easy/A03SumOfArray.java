package com.example.dsa.array.gfg.easy;

public class A03SumOfArray {
    public static void main(String[] args) {
        int arr[]={1, 4, 5, 3, 2};
        System.out.println(sumOfArray(arr));
    }

    public static int sumOfArray(int arr[]){
        int res=0;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                res+=sum;
            }
        }
        return res;
    }
}
