package com.example.dsa.array.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A03MajorityNumber {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		int majorityNumber = majorityNumber(arr);
		System.out.println(majorityNumber);
		int majorityNumber2 = majorityNumber2(arr);
		System.out.println(majorityNumber2);
	}

	// Brute force
	public static int majorityNumber(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > n / 2) {
				return arr[i];
			}
		}
		return -1;
	}

	// Better
	public static int majorityNumber2(int arr[]) {
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			Integer value = map.getOrDefault(arr[i], 0);
			map.put(arr[i], value + 1);
		}

		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > n / 2) {
				return m.getKey();
			}

		}

		return -1;
	}

}
