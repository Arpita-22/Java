package com.practice.self;

public class ValidPerfectSquare {
	public static void main(String [] args) {
		System.out.println(isPerfectSquare(2000105819));
		
	}
	
	 public static boolean isPerfectSquare(int num) {
		 if(num == 0) return false;
//		  long [] arr = new int [num];
//		  System.out.println(num % 10);
		  
		  //to get the last digit of a number
		  int lastDigit = num % 10;
		  
		  if(lastDigit == 2 || lastDigit == 3 || lastDigit == 7 || lastDigit == 8) {
			  return false;
		  }
		  
//		  for(int i = 0; i < arr.length; i++) {
//			  arr[i] = i + 1;
//		  }
		  
		  int left = 1;
		  int right = num;
		  
		  while(left <= right) {
			  long mid = (left + right)/2;
			  long square = mid * mid;
			  
			  if(square == num) {
				  return true;
			  }
			  
			  else if (square > num) {
				  right = (int)mid - 1;
			  }
			  else {
				  left = (int)mid + 1;
			  }
			  
		  }
		 
	        return false;
	    }

}
