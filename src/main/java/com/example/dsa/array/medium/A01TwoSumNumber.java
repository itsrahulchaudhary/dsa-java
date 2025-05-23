package com.example.dsa.array.medium;

import java.util.Arrays;
import java.util.HashMap;

public class A01TwoSumNumber {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 5, 8, 11 };
		int target = 14;
		// Variant 1
		// System.out.println(twoSum(arr, target));
		// Variant 2
		//int[] twoSumIndex = twoSumIndex(arr, target);
		//System.out.println(twoSumIndex[0] + " " + twoSumIndex[1]);
		// Variant 1
		// System.out.println(twoSum2(arr, target));
		// Variant 2
		int[] twoSumIndexB = twoSumIndex(arr, target);
		System.out.println(twoSumIndexB[0] + " " + twoSumIndexB[1]);
		System.out.println(twoSum3(arr, target));
	}

	// Brute force - Variant 1
	public static String twoSum(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return "YES";
				}
			}
		}
		return "NO";
	}

	// Brute force - Variant 2
	public static int[] twoSumIndex(int arr[], int target) {
		int[] ans = new int[2];
		ans[0] = -1;
		ans[1] = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
			}
		}
		return ans;
	}

	// Better Approach - Variant 1
	public static String twoSum2(int arr[], int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int moreNeed = target - arr[i];
			if (map.containsKey(moreNeed)) {
				return "YES";
			}
			map.put(arr[i], i);
		}
		return "NO";
	}
	
	// Better Approach - Variant 2
	public static int[] twoSumIndex2(int arr[], int target) {
		int[] ans = new int[2];
		ans[0] = ans[1] = -1;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int moreNeed = target - arr[i];
			if (map.containsKey(moreNeed)) {
				ans[0] = map.get(moreNeed);
				ans[1] = i;
				return ans;
			}
			map.put(arr[i], i);
		}
		return ans;
	}
	
	// Optimal
	public static String twoSum3(int arr[], int target) {
		Arrays.sort(arr);
		int i =0; 
		int j =arr.length-1;
		while(i<j) {
			int sum = arr[i] +arr[j];
			if(sum == target) {
				return "YES";
			}else if(sum<target) {
				i++;
			}else {
				j--;
			}
		}
		return "NO";
	}

}
