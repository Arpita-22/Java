package language.practice.self;

public class Exception {
	
	public static void main(String[]args) {
		int [] nums = {1,2,3,4};
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]!= 4) {
				throw new ArithmeticException("Array out of bounds");
			}else {
				System.out.println("Print array");
			}		
		}
	}
		

}
