package com.example.dsa.array.tuf.easy;

public class A11MaximumConsecutiveOnes {
    public static void main(String[] args) {
       int arr[] = {1,1,0,1,1,1,0,1,1};
        int i = maxConsecutiveOnes(arr);
        System.out.println(i);
    }

    public static int maxConsecutiveOnes(int  arr[]){
        int count = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count = 0;
            }
        }
        return max;
    }
}
