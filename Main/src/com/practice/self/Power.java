package com.practice.self;

import java.util.Arrays;

public class Power {
	 public static void main(String [] args) {

		 int[] arr1 = new int[2];
		 int[] arr2 = new int[] {1,2};
		 
		 //System.out.println(power(2,4));
		 //System.out.println(factorial(4));
		 System.out.println(productOfArray(new int[]{1,2,3}));
		 //System.out.println(recursiveRange(6));
		 //System.out.println(fib(6));
		 //System.out.println(productOfArrayOuter(new int[]{1,2,3}));
	 }
	 
	 public static int power(int base, int exponent){
		    if (exponent == 0) return 1;
		    return base * power(base, exponent - 1);
		}
	 
	 public static int factorial(int num) {
		 if (num == 0) return 1;
		 return num * factorial(num - 1);
	 }
	 
	 public static int productOfArray(int[] arr) {
		 if (arr.length == 0) return 1;
		 int[] arrInterim = Arrays.copyOfRange(arr, 1, arr.length);
		 return arr[0] * productOfArray(arrInterim);
	 }
	 
	 public static int productOfArrayOuter(int[] arr) {
		 return productOfArray1(arr, arr.length - 1);
	 }
	 public static int productOfArray1(int[] arr, int index) {
		 if (index < 0) return 1;
		 return arr[index] * productOfArray1(arr, index - 1);
	 }
	 
	 public static int recursiveRange(int num) {
		 if(num == 0) return 0;
		 return num + recursiveRange(num - 1);
	 }
	 
	 public static int fib(int num) {
		 if(num == 1 || num == 2) return 1;
		 return fib(num - 1)+ fib (num - 2);
	 }
}
