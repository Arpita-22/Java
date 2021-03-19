package language.practice.self;

public class Modifiers {

		private boolean myFlag;
		static final double weeks = 9.5;
		protected static final int BOXWIDTH = 42;

		public static void main(String[] arguments) {
		   // body of method
			int [] nums = {1,2,3,4};
			String name = "flower";
			Integer y = 1;
			//conditional operator
			var x = (y == 1)?  true: false;
			
			//instanceof operator
			boolean result = y instanceof Integer;
			System.out.println(result);
			
			for(int num: nums) {
				System.out.println(num);
			}
		}

}
