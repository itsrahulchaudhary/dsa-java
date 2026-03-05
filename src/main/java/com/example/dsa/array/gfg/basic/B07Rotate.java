package com.example.dsa.array.gfg.basic;

public class B07Rotate {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6};
        rotate2(arr);
    }

    public static int[] rotate(int arr[]){
        int d=2;
        int n=arr.length-1;
        d%=n;
        int temp[]=new int[d];
        int indx=0;
        for(int i=n-(d-1); i<=n; i++){
            temp[indx++]=arr[i];
        }
        for(int i=n; i>=d; i--){
            arr[i]=arr[i-d];
        }
        for(int i=0; i<d; i++){
            arr[i]=temp[i];
        }

        for (int p : arr){
            System.out.print(p+" ");
        }
        System.out.println();
        return arr;
    }

    public static int[] rotate2(int arr[]){
        int d=2;
        int n=arr.length;
        d%=n;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        for (int p : arr){
            System.out.print(p+" ");
        }
        System.out.println();
        return arr;
    }

    public static void reverse(int arr[], int start, int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
