package com.example.dsa.array.easy;

public class A05LeftRotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //leftRotate(arr);
        rotate(arr);
    }

    public static void leftRotate(int arr[]){
        int temp = arr[0];
        int n = arr.length;
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        print(arr);
    }


    public static void rotate(int[] arr) {
        // code here
        int n = arr.length;
        int last = arr[n - 1];

        // Shift elements to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Put last element at the first position
        arr[0] = last;
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
       // print(arr);
    }

    public static void print(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
