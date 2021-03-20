package language.practice.self;


//reverse a string
public class StringBufferPractice {
	
	public static void main(String [] args) {
		
		String name = "Hello world";
		
		StringBuffer s = new StringBuffer();
		
		//s.reverse();
	
		int length = name.length() - 1;
		
		for(int i = 0; i < name.length(); i++) {
			
			s.append(name.charAt(length - i));
			
		}

		//converting a string buffer to a string and then converting to lowercase
		System.out.println(s.toString().toLowerCase());
		
	}
	
}

		
//		StringBuilder s = new StringBuilder();
//		int length = name.length() - 1;
//		for(int i = 0; i < name.length(); i++) {
//			s.append(name.charAt(length - i));
//			
//		}
//		//converting a string builder to a string and then converting to lowercase
//		System.out.println(s.toString().toLowerCase());
		

//		char [] reverse = new char[name.length()];
//		int length = name.length() - 1;
//		
//		for(int i = 0; i <= length; i++) {
//			reverse[i] = name.charAt(length - i);
//		}
//		System.out.println(String.valueOf(reverse).toLowerCase());
		

	

