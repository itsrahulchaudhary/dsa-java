package com.example.dsa.binarySearch.medium;
// Finding Sqrt of a number using Binary Search
public class BS01FindingSqrt {
    public static void main(String[] args) {
       int n =28;
      //  int i = floorSqrt(n);
        int i = floorSqrt2(n);
        System.out.println(i);
    }

    // brute force
    public static int floorSqrt(int n){
        int ans = 0;
        for(int i=1; i<=n; i++){
            long value = i*i;
            if(value<=(long) n){
               ans = i;
            }else {
                break;
            }
        }
        return ans;
    }

    public static int floorSqrt2(int n){
        int low = 1;
        int high = n;
        while (low<=high){
            int mid = low+(high-low)/2;
            long value = mid*mid;
            if(value<=(long) n){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return high;
    }
}
