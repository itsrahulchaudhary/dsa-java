package com.example.dsa.binarySearch.medium;

import java.util.ArrayList;

// Median of 2 sorted arrays
public class BS13MedianOfSorted {
    public static void main(String[] args) {
        int arr1[]={1,3,4,7,10,12};
        int arr2[]={2,3,6,15};
        System.out.println(
                medianBetter(arr1,arr2)
        );
    }

    public static int medianBF(int arr1[], int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> res=new ArrayList<>();
        while (i<n && j<m){
            if(arr1[i]<arr2[j]){
                res.add(arr1[i++]);
            }else {
                res.add(arr2[j++]);
            }
        }

        while (i<n){
            res.add(arr1[i++]);
        }

        while (j<m){
            res.add(arr2[j++]);
        }

        int tn=n+m;
        if(tn % 2==1){
            return res.get(res.size()/2);
        }
        return ((res.get(res.size()/2))+ (res.get((res.size()-1)/2)))/2;
    }

    public static int medianBetter(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int n=n1+n2;
        int ind2=n/2;
        int ind1=ind2-1;
        int ind1ele=-1;
        int ind2ele=-1;
        int i=0;
        int j=0;
        int count=0;
        while (i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                if(count==ind1){
                    ind1ele=arr1[i];
                }
                if(count==ind2){
                    ind2ele=arr1[i];
                }
                count++;
                i++;
            }else {
                if(count==ind1){
                    ind1ele=arr2[j];
                }
                if(count==ind2){
                    ind2ele=arr2[j];
                }
                count++;
                j++;
            }
        }
        while (i<n1){
            if(count==ind1){
                ind1ele=arr1[i];
            }
            if(count==ind2){
                ind2ele=arr1[i];
            }
            count++;
            i++;
        }

        while (j<n2){
            if(count==ind1){
                ind1ele=arr2[j];
            }
            if(count==ind2){
                ind2ele=arr2[j];
            }
            count++;
            j++;
        }
        if(n % 2 ==1){
            return ind2ele;
        }
        return (ind1ele+ind2ele)/2;
    }

}
