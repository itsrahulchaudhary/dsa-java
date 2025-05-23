package com.example.dsa.binarySearch.easy;
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
// Duplicate element
public class BS10 {
	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 3, 3, 3, 3 };
		int target = 3;
		System.out.println(rotatedArray(arr, target));
	}

	public static int rotatedArray(int arr[], int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
				low = low + 1;
				high = high - 1;
				continue;
			}
			if (arr[low] <= arr[mid]) {
				if (arr[low] <= target && arr[mid] >= target) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (arr[mid] <= target && arr[high] >= target) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

}
