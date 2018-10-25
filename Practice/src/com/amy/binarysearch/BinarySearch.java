package com.amy.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 8, 11, 18 };
		int index = binarySearch(arr, 13);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (arr[m] == x) {
				return m;
			} else if (arr[m] < x) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		
		//find Nearest element
		int diff = x - arr[l];
		int diff1 = arr[r] - x;
		if (diff < diff1) {
			return arr[l];
		}
		return arr[r];
	}

}
