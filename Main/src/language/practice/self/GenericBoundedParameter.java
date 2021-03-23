package language.practice.self;

public class GenericBoundedParameter {
	//determines largest of three comparables
	
	public static <T extends Comparable<T>> T maximum (T x,T y, T z ){
		
		T max = x;
		
		//compares the current object with the specified object
		//either returns positive, negative or zero 
		// compares the given string with current string lexicographically
		
		if(y.compareTo(x) > 0) {
			
			max = y;
		}
		
		if(z.compareTo(x) > 0) {
			
			max = z;
		}
		
		 return max;
		
	}
	
	public static void main(String[] args) {
		System.out.println(maximum( 3, 4, 2));
		
		
		System.out.println(maximum("pear", "apple", "orange"));
		
	}
	

}
