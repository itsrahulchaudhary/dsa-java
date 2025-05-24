package com.example.dsa.array.easy;

public class A06LeftRotateDPlace {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};// 4,5,6,7,1,2,3
        dPlaceLeftRotate2(arr);
    }

    public static void dPlaceLeftRotate(int arr[]){
        int n = arr.length;
       // int d = n%2;
        int d = 3;
        int temp[] = new int[d];
        for(int i =0; i<d; i++){
            temp[i]=arr[i];
        }
        // shifting
        for(int i = d; i<n; i++){
            arr[i-d]=arr[i];
        }

        int j=0;
        for(int i = n-d; i<n; i++){
            arr[i] = temp[j];
            j++;
        }
        print(arr);

    }
    public static void print(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void dPlaceLeftRotate2(int arr[]){
        int n = arr.length;
        int d =3;
        //reverse(arr,0, n-d-1-1);
        //reverse(arr,n-d-1, n-1);
        //reverse(arr,0, n-1);
        reverse(arr,0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        print(arr);

    }
    public static void reverse(int arr[], int start, int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
