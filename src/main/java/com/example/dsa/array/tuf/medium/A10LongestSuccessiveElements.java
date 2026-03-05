package com.example.dsa.array.tuf.medium;

import java.util.HashSet;

public class A10LongestSuccessiveElements {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(
               // longestConsecutive(arr)
                longestConsecutive2(arr)
        );
    }


    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int count = 1;

            // keep checking next numbers one by one
            while (contains(nums, currentNum + 1)) {
                currentNum++;
                count++;
            }

            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static int longestConsecutive2(int arr[]){
        if(arr == null || arr.length==0)
            return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int  num : arr){
            set.add(num);
        }
        int longest = 0;
        for (int n : set){
            int count=1;
            if(!set.contains(n-1)){
                int currentNum = n;
                while (set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    // helper function to check if an element exists in array
    private static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) return true;
        }
        return false;
    }


}
