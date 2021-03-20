package language.practice.self;

class Outer{
	// private variable of the outer class
	private int num = 175;
	
	//inner class
	public class Inner{
		public int getNum(){
			System.out.println("getNum method of inner class");
			return num;
		}
		
	}
	
}

public class OuterDemo {
	public static void main(String [] args) {
		 // Instantiating the outer class
		Outer outer = new Outer();
		
		//Instantiating the inner class
		Outer.Inner inner = outer.new Inner();
		System.out.print(inner.getNum());
	}
}

//public class Outerclass {
//	   // instance method of the outer class 
//	   void my_Method() {
//	      int num = 23;
//
//	      // method-local inner class
//	      class MethodInner_Demo {
//	         public void print() {
//	            System.out.println("This is method inner class "+num);	   
//	         }   
//	      } // end of inner class
//		   
//	      // Accessing the inner class
//	      MethodInner_Demo inner = new MethodInner_Demo();
//	      inner.print();
//	   }
//	   
//	   public static void main(String args[]) {
//	      Outerclass outer = new Outerclass();
//	      outer.my_Method();	   	   
//	   }
//	}
