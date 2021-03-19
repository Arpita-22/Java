package language.practice.self;

public class MethodOverload {
	public static void main(String[]args){
		int a = 11;
		int b = 6;
		double c = 7.5;
		double d = 2.3;
		
		int result1 = min(a,b);
		double result2 = min(c,d);
		System.out.println(result1);
		System.out.println(result2);
		// Call method with variable args 
		printMax(new int [] {1,2,3,4});
	}

	public static int min(int n1, int n2) {
	      int min;
	      if (n1 > n2)
	         min = n2;
	      else
	         min = n1;

	      return min;
	}
	
	public static double min(double n1, double n2) {
	      double min;
	      if (n1 > n2)
	         min = n2;
	      else
	         min = n1;

	      return min;
		
	}
	//method with variable no of arguments of the same type
	public static void printMax(int...nums) {
		for(int num: nums) {
			System.out.println(num);
		}
		
	}
	
}
