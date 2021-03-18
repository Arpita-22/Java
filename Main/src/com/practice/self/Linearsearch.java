package com.practice.self;

public class Linearsearch {
	public static void main(String[] args) {
		System.out.println(linearSearch(new int[] { 1, 3, 4, 5, 9 }, 5));
	}

	public static int linearSearch(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val)
				return i;
		}
		return -1;
	}

}
