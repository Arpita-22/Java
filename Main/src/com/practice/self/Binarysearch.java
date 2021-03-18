package com.practice.self;

public class Binarysearch {
	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] { 1, 2, 3, 5, 9 }, 4));

	}

	public static int binarySearch(int[] arr, int val) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (arr[middle] == val) {
				return middle;
			} else if (arr[middle] > val) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		return -1;
	}
}
