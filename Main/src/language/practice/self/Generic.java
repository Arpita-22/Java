package language.practice.self;

public class Generic {
	
	//generic method print array
	public static < E > void printArray(E [] inputArray) {
		for(E element: inputArray) {
			System.out.print(element);
		}
		System.out.println (" ");
	}
	
	public static void main(String[]args) {
		
		Integer [] nums =  {1,2,3,4};
		
		Character [] letters = {'h','e','l','l','o'};
		
		printArray(nums);
		
		printArray(letters);
	}

}
