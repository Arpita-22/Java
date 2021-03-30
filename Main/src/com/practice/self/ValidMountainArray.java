package com.practice.self;

public class ValidMountainArray {
	public static void main (String [] args) {
		
		System.out.println(validMountainArray(new int[]{0,3,2,1}));
		
	}
	
    public static boolean validMountainArray(int[] arr) {
    	if(arr.length < 3) {
    		return false;
    	}
    	
    	int i = 0;
    	
    	for( ;i < arr.length && (i + 1) < arr.length; i++) {
    		
    		if(arr[i] == arr[i + 1]) {
    			return false;
    		}
    		
    		if(arr[i] > arr[i + 1]) {
    			break;
    		}
    		
    	}
    	
    	if(i == 0 || (i + 1) >= arr.length) {
   		return false;
    	}
    	
    	for(;i < arr.length  && (i + 1) < arr.length; i++) {
    		
    		if(arr[i] <= arr[i + 1]) {
    			
    		return false;	
    		}
 
    	}
    		 	
        return true;
    }
}
