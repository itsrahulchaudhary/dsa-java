package com.example.dsa.array.tuf.medium;

public class A02Sort012 {
	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 2, 0, 1 };
		//int[] sort012 = sort012(arr);
		//print(sort012);
		sort012_Optimal(arr);
		print(arr);
	}

	// Better
	public static int[] sort012(int arr[]) {
		int n = arr.length;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				count0++;
			else if (arr[i] == 1)
				count1++;
			else
				count2++;
		}
		for (int i = 0; i < count0; i++)
			arr[i] = 0;
		for (int i = count0; i < count0 + count1; i++)
			arr[i] = 1;
		for (int i = count0 + count1; i < n; i++)
			arr[i] = 2;

		return arr;
	}

	public static void sort012_Optimal(int arr[]) {
		int mid = 0;
		int low = 0;
		int high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
	}

	public static void print(int arr[]) {
		// printing
		for (int p : arr) {
			System.out.print(p + " ");
		}
	}

}
