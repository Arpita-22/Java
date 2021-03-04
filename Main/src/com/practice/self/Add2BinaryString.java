package com.practice.self;

public class Add2BinaryString {

	public static void main(String[] args) {
		String a = "111";
		String b = "111";
		System.out.println(add(a, b));
	}
	/**
	 *  a = 111
	 *  b = 001
	 *  -------
	 *  c = 100
	 */
	public static String add(String a, String b) {
		int n = a.length(), m = b.length();
		if (n > m) {
			b = prependZeroes(b, (n - m));
		} else if (m > n) {
			a = prependZeroes(a, (m - n));
		}
		
		int k = Math.max(n, m) - 1;
	
		String result = "";
		int carry = 0;
		
		while (k >= 0) {
			int p = a.charAt(k) - '0';
			int q = b.charAt(k) - '0';
			
			// the bits are different, either first is 1 + 0 OR 0 + 1
			if((p ^ q) == 1) {
				//carry is 1
				if ((carry ^ (p ^ q)) == 0) {
					result = "0" + result;
					carry = 1;
				} 
				//carry is 0
				else {
					result = "1" + result;
					carry = 0;
				}
			}
			
			else {
				result = carry + result;
				if(p == 1 && q == 1) {
					carry = 1;
				} else {
					carry = 0;
				}
			}  
			k--;
		}
		return carry == 1 ? ("1" + result) : result;
	}
	
	public static String prependZeroes(String s, int p) {
		String newString = s;
		for (int i = 0; i < p; i++) {
			newString = "0" + newString;
		}
		return newString;
	}
}
