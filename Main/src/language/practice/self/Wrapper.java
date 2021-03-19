package language.practice.self;
import java.util.Date;

public class Wrapper {

	public static void main(String[]args) {
		Integer x = 1; // boxes int to an Integer object
		x = x + 1; // unboxes the Integer to a int
		
		// Here following primitive char 'a'
		// is boxed into the Character object ch
		Character ch = 'a';

		// Here primitive 'x' is boxed for method test,
		// return is unboxed to char 'c'
//		char c = ch.test('x');
		
		char[] helloArr = {'h','e','l','l','o','.'};
		String helloString = new String(helloArr);
		System.out.println(helloString);
		
		//declaring an array and specifying the size
		double [] val = new double [10];
		double [] nums = {3.5, 2.1, 5.7, 7.9};
		
		double max = nums[0];
		for(int i = 0;i < nums.length;i++){
			max = Math.max(max, nums[i]);
		}
		System.out.println(max);
		
		//passing array in a method and invoking it
		printArr(new double[] {1.2, 3.4, 5.6});
		System.out.println(reverse(new int [] {1,2,3,4,5}));
		
		Date date = new Date();
		System.out.println(date.toString());
		
		
	}
	//returning an array from method
	public static int [] reverse(int[]arr){
		int [] result = new int [arr.length];
		for(int i = 0,j= arr.length - 1;i < arr.length && j >= 0; i++,j--) {
			result[j] = arr[i];
		}
		return result;
	}
	
	public static void printArr(double[]nums) {
		//foreach loop
		for(double num: nums) {
			System.out.println(num);
		}
	}
	
}
