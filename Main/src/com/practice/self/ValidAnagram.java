package com.practice.self;
import java.util.HashMap;

public class ValidAnagram {
	
	public static void main(String [] args) {
		System.out.println(isAnagram("aacc","ccaa"));
	}
	
	 public static boolean isAnagram(String s, String t) {
		 if(s.length() != t.length()) {
			 return false;
		 }
		 
		 HashMap<String, Integer> anagram = new HashMap<String, Integer>();
		 HashMap<String, Integer> anagramT = new HashMap<String, Integer>();
		 
		 for(char ch: s.toCharArray()) {
			 Integer val = anagram.get(ch + "");
			 if(val == null) {
				 val = 1;
			 }else {
				 val += 1;
			 }
			 anagram.put(ch + "", val);
		 }
//		  System.out.println(anagram);
		 
		 for(char ch: t.toCharArray()) {
			 Integer val = anagramT.get(ch + "");
			 if(val == null) {
				 val = 1;
			 }else {
				 val += 1;
			 }
			 anagramT.put(ch + "", val);
		 }
		 
		 if(!anagram.equals(anagramT)) {
			 return false;
		 }
		  
		  
//		  for(char ch: t.toCharArray()) {
//			  Integer value = anagram.get(ch + "");
//			  if(value != null) {
//				  value--;
//               }
//			  if(value == null) {
//				  return false;
//			  }
//			  if(!anagram.containsKey(ch + "")) {
//				  return false;
//			  }
//			  anagram.put(ch + "", value);
//	 		}
		  

		 return true;
	        
	    }
}
