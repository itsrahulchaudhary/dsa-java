package com.example.dsa.binarySearch.easy;

// https://leetcode.com/problems/binary-search/
public class BS01 {
	public static void main(String[] args) {
		int arr[] = { -1, 0, 3, 5, 9, 12 };
	//	int[] arr = {2, 3, 5, 7, 9};
		int target = 5;
		 System.out.println(binarySearch(arr, target));
		//System.out.println(binarySearchRec(arr, 0, arr.length - 1, target));
	}

	public static int binarySearch(int arr[], int target) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static int binarySearchRec(int arr[], int low, int high, int target) {
		if (low > high)
			return -1;

		int mid = low + (high - low) / 2;
		if (target == arr[mid]) {
			return mid;
		} else if (target > arr[mid]) {
			return binarySearchRec(arr, mid + 1, high, target);
		}
		return binarySearchRec(arr, low, mid - 1, target);
	}

}
