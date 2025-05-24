package com.example.dsa.binarySearch.easy;

// Lower Bound smallest index such that arr[index]>=x
public class BS02LowerBound {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
		int x = 4;
		System.out.println(lowerBound(arr, x));


	}

	public static int lowerBound(int arr[], int x) {
		int low = 0;
		int high = arr.length - 1;
		int ans = arr.length;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= x) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

}
