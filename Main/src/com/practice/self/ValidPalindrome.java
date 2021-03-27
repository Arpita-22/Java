package com.practice.self;

public class ValidPalindrome {
	public static void main(String [] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
	
    public static boolean isPalindrome(String s) {
        // s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        // System.out.println(s);
        String newStr = "";
        for(char ch: s.toCharArray()){
             if((int)ch >= 48 && (int) ch <= 57){
                newStr += ch + "";
            }
            else if((int)ch >=97 && (int) ch <= 122){
                newStr += ch + "";
            }    
        }
        StringBuffer str = new StringBuffer(new String(newStr));
        String reverse = str.reverse().toString();
        System.out.println(reverse);
        System.out.println(newStr);
        
        if(reverse.equals(newStr)){
             return true;
        }
          return false;     
    }

}
