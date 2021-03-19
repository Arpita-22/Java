package com.practice.self;

public class MinSubArrayLen {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 4, 3 };
		int sum = 7;
		System.out.println(minSubArrayLen(arr, sum));
	}

	public static int minSubArrayLen(int[] arr, int sum) {
		int n = arr.length;
		// i -> window length
		for (int i = 1; i < n; i++) {
			// function to see if we found a window
			if (foundWindow(arr, sum, i, n)) {
				return i;
			}
		}
		return 0;
	}

	public static boolean foundWindow(int[] arr, int sum, int windowLen, int n) {
		for (int i = 0; i <= n - windowLen; i++) {
			int sumWindow = 0;
			for (int j = i; j < i + windowLen; j++) {
				sumWindow += arr[j];
			}
			if (sumWindow == sum) {
				return true;
			}
		}
		return false;
	}
}
