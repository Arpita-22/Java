package com.practice.self;

public class ClimbingStairs {
	public static void main(String[]args) {
        System.out.println(climbStairs(5));
	}
	
    public static int climbStairs(int n) {
        if(n == 1 || n == 2 || n == 3){
            return n;
        }
        int num1 = 1;
        int num2 = 2;
        int result = 0;
        for(int i = 3; i < n; i++){
            result += num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
	
    }

}
