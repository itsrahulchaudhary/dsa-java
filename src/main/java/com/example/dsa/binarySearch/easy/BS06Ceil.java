package com.example.dsa.binarySearch.easy;
// Ceil
public class BS06Ceil {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int x = 45;
		int floor = ceil(arr, x);
		System.out.println(floor);

	}
	
	public static int ceil(int arr[], int x) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= x) {
				ans = arr[mid];
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

}
