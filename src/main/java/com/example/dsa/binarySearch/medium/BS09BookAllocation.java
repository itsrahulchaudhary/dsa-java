package com.example.dsa.binarySearch.medium;

public class BS09BookAllocation {
    public static void main(String[] args) {
        int arr[]={25,46,28,49,24};
        int student=4;
        System.out.println(
                bookAllocationBS(arr,student)
        );

    }

    public static int bookAllocation(int arr[], int student){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int n : arr){
            maxi=Math.max(maxi,n);
            sum+=n;
        }
        for(int i=maxi; i<=sum; i++){
            int countStudent = pagesCount(arr,i);
            if(countStudent==student){
                return i;
            }
        }
        return -1;
    }

    public static int bookAllocationBS(int arr[], int student){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int n : arr){
            maxi=Math.max(maxi,n);
            sum+=n;
        }
        int low=maxi;
        int high=sum;
        while (low<=high){
            int mid=low+(high-low)/2;
            int countStudent=pagesCount(arr,mid);
            if(countStudent==student){
                return mid;
            }
            if(countStudent<student){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static int pagesCount(int arr[], int pages){
        int student=1;
        int countPages=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]+countPages<=pages){
                countPages+=arr[i];
            }else {
                student++;
                countPages=arr[i];
            }
        }
        return student;
    }
}
