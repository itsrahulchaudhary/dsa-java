package com.example.dsa.binarySearch.easy;

// Peak element in Array
public class BS14 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
		int i = peakElementBruteForce2(arr);
		System.out.println(i);
	}

	public static int peakElementBruteForce(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if ((i == 0 || arr[i - 1] < arr[i]) && (i == arr.length - 1 || arr[i] > arr[i + 1])) {
				return arr[i];
			}
		}
		return -1;
	}

	public static int peakElementBruteForce2(int arr[]) {
		int n = arr.length - 1;
		if (n == 1)
			return arr[n];
		if (arr[0] > arr[1])
			return arr[0];
		if (arr[n] > arr[n - 1])
			return arr[n];
		for (int i = 1; i < n - 1; i++) {
			if (arr[i - 1] < arr[i] && (arr[i] > arr[i + 1])) {
				return arr[i];
			}
		}
		return -1;
	}

}
