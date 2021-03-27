package com.practice.self;


public class ValidBoomerang {
	public static void main(String [] args) {
		System.out.println(isBoomerang(new int [][] {{0,0},{1,2},{0,1}}));
	}
    public static boolean isBoomerang(int[][] points) {
    	int aX = points[0][0];
    	int aY = points[0][1];
    	int bX = points[1][0];
    	int bY = points[1][1];
    	int cX = points[2][0];
    	int cY = points[2][1];
    	
    	double area = Math.abs((aX *(bY - cY)+ bX *(cY - aY)+ cX *(aY - bY))/ 2.0);
    	
    	
    	System.out.println(area);
    	
    	//(area == 0d)
    	if(area == 0.0) {
    		return false;
    	}
        return true;
    }

}
