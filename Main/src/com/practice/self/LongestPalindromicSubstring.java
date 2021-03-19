package com.practice.self;
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		//System.out.println(longestPalindrome("abdbc"));
		System.out.println(longestPalindrome1("abba"));
	}

	public static String longestPalindrome(String s) {
		int n = s.length();
		int maxlength = 1, start = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int flag = 1;
				for (int k = 0; k < (j - i + 1) / 2; k++) {
					if (s.charAt(i + k) != s.charAt(j - k))
						flag = 0;
					if (flag != 0 && (j - i + 1) > maxlength) {
						start = i;
						maxlength = j - i + 1;
						return (s.substring(start, (maxlength)));
					}
				}
			}
		}
		return s;
	}
	
	public static String longestPalindrome1(final String s) {
		int n = s.length();
		
		if(n == 1) {
			return s;
		}
		if(n == 2 && s.charAt(0) == s.charAt(1)) {
			return s;
		} else if(n == 2 && s.charAt(0) != s.charAt(1)){
			return s.charAt(0) + "";
		}
		
		int maxLength = 0;
		String response = "";
		for (int i = 0; i < n; i++) {
			int p = i - 1, q = i + 1;
			while(p >= 0 && q < n) {
				if(s.charAt(p) == s.charAt(q)) {
					if(q - p + 1 > maxLength) {
						maxLength = q - p + 1;
						response = s.substring(p, q + 1);
					}
				} else {
					break;
				}
				p--;
				q++;
			}
		}
		return response;
	}

}
