package com.example.dsa.binarySearch.easy;

// Count occurrences of a number in a sorted array with duplicates
public class BS08 {
	public static void main(String[] args) {

		int arr[] = { 2, 2, 3, 3, 3, 3, 4 };
		int x = 3;
		int count = count(arr, x);
		System.out.println(count);
	}

	public static int count(int arr[], int x) {
		int first = findPosition(arr, x, true);
		if (first == -1)
			return 0;
		int last = findPosition(arr, x, false);
		return last - first + 1;
	}

	public static int findPosition(int arr[], int x, boolean isFirst) {
		int low = 0;
		int high = arr.length - 1;
		int res = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x) {
				res = mid;
				if (isFirst) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else if (arr[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return res;
	}
}
