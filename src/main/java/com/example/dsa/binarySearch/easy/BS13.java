package com.example.dsa.binarySearch.easy;

public class BS13 {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
		// int singleElementBruteForce = singleElementBruteForce(arr);
		int singleElementBruteForce = singleElement(arr);
		System.out.println(singleElementBruteForce);
	}

	public static int singleElement(int arr[]) {
		int n = arr.length - 1;
		if (n == 0)
			return arr[0];
		if (arr[n] != arr[n - 1])
			return arr[n];
		int low = 1;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
				return arr[mid];
			if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static int singleElementBruteForce(int arr[]) {
		int n = arr.length - 1;
		if (n == 0)
			return arr[0];
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				if (arr[i] != arr[i + 1]) {
					return arr[i];
				}
			} else if (i == n) {
				if (arr[i] != arr[i - 1]) {
					return arr[i];
				}
			} else {
				if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

}
