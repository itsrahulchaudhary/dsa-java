package com.example.dsa.binarySearch.easy;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class BS07 {

	public static void main(String[] args) {
		int arr[] = { 2, 8, 8, 8, 8, 8, 11, 13 };
		int k = 8;
		int[] position = findFirstAndLastPosition2(arr, k);
		System.out.println(position[0]);
		System.out.println(position[1]);
	}

	public static int[] findFirstAndLastPosition(int arr[], int k) {
		int first = firstOccurrence(arr, k);
		if (first == -1)
			return new int[] { -1, -1 };
		int last = lastOccurrence(arr, k);
		return new int[] { first, last };

	}

	public static int[] findFirstAndLastPosition2(int arr[], int k) {
		int first = findPosition(arr, k, true);
		if (first == -1)
			return new int[] { -1, -1 };
		int last = findPosition(arr, k, false);
		return new int[] { first, last };

	}

	public static int firstOccurrence(int arr[], int k) {
		int low = 0;
		int high = arr.length - 1;
		int first = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == k) {
				first = mid;
				high = mid - 1;
			} else if (arr[mid] < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return first;
	}

	public static int lastOccurrence(int arr[], int k) {
		int low = 0;
		int high = arr.length - 1;
		int last = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == k) {
				last = mid;
				low = mid + 1;
			} else if (arr[mid] < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return last;
	}

	// Method to find the first or last position of the target
	public static int findPosition(int arr[], int k, boolean isFirst) {
		int low = 0;
		int high = arr.length - 1;
		int first = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == k) {
				first = mid;
				if (isFirst) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else if (arr[mid] < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return first;
	}
}
