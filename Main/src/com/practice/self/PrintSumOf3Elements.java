package com.practice.self;

public class PrintSumOf3Elements {

	public static void main(String[] args) {
		int[] input = { 2, 3, 1, 2, 4, 3 }; 
		int[] output = { 6, 6, 7, 9 }; 
		printSumOf3Elements(input);
		
	}

	private static void printSumOf3Elements(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i <= arr.length - 3; i++) {
			for(int j = i;j < i + 3; j++) {
				sum += arr[j];
			}
			System.out.println(sum);
			sum = 0;
		}

	}

}
