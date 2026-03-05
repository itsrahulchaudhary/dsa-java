package com.example.dsa.array.gfg.basic;

public class B08ZeroAtEnd {
    public static void main(String[] args) {
        int arr[]={1, 2, 0, 4, 3, 0, 5, 0};
        zeroAtEnd(arr);
    }

    public static int[] zeroAtEnd(int arr[]){
        int j=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1; i<arr.length; i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for (int p : arr){
            System.out.print(p+" ");
        }
        System.out.println();

        return arr;
    }
}
