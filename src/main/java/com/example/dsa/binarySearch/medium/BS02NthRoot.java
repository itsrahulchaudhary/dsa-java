package com.example.dsa.binarySearch.medium;
// Nth Root of a Number using Binary Search
public class BS02NthRoot {
    public static void main(String[] args) {
         int n = 3;
         int m = 27;
        int i = NthRoot2(m, n);
       // int i = NthRoot(m, n);
        System.out.println(i);
    }

    // brute force
    public static int NthRoot(int m,int n){
        for (int i = 0; i<=m; i++){
            long value = power(i, n);
            if(value==m){
                return i;
            } else if (value>m) {
                break;
            }
        }
        return -1;
    }

    public static int NthRoot2(int m, int n){
        int low = 1;
        int high = n;
        while (low<=high){
            int mid = low+(high-low)/2;
            long value = power(mid,n);
            if(value==m){
                return mid;
            } else if (value>m) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static long power(long a, int n){
        long result = 1;
        long absExpression = a<0?-n:n;
        for (int i=0; i<absExpression; i++){
            result=result*a;
        }
        if(absExpression<0){
            return 1/result;
        }
        return  result;
    }
}
