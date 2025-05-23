package com.example.dsa.binarySearch.easy;
// https://www.geeksforgeeks.org/problems/rotation4723/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=rotation
// Find out how many times has an array been rotated
public class BS12 {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
		int ans = findKRotation(arr);
		System.out.println("The array is rotated " + ans + " times.");
	}

	public static int findKRotation(int[] arr) {
		int low = 0, high = arr.length - 1;
		int ans = Integer.MAX_VALUE;
		int index = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// search space is already sorted
			// then arr[low] will always be
			// the minimum in that search space:
			if (arr[low] <= arr[high]) {
				if (arr[low] < ans) {
					index = low;
					ans = arr[low];
				}
				break;
			}

			// if left part is sorted:
			if (arr[low] <= arr[mid]) {
				// keep the minimum:
				if (arr[low] < ans) {
					index = low;
					ans = arr[low];
				}

				// Eliminate left half:
				low = mid + 1;
			} else { // if right part is sorted:

				// keep the minimum:
				if (arr[mid] < ans) {
					index = mid;
					ans = arr[mid];
				}

				// Eliminate right half:
				high = mid - 1;
			}
		}
		return index;
	}
}
