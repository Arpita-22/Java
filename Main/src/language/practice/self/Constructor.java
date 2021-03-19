package language.practice.self;

public class Constructor {
	int myNum;
	int num2;
	
	//instance variable public and private
	public String name;
	
	private double num;
	
	//class variables
	//salary variable is a static variable
	public static double salary;
	
	//DEPARTMENT is a constant
	
	public static final String DEPARTMENT = "development";
	
	
	
	
	public Constructor(){
		
	}
	//no argument constructor
//	Constructor(){
//		num2 = 100;
//	}
	
	//constructor 
	public Constructor(String name) {
		//this constructor has one parameter, name
		System.out.println(name);
	}
	
	//setter method
		public void setNum(int num) {
			myNum = num;
		}
		
	//getter method
		public int getNum() {
			System.out.println(myNum);
			return myNum;
		}
		
	
	public static void main(String[]args) {
		//following statement would create an object myObject
		Constructor myObj = new Constructor("apple");
//		Constructor myObj1 = new Constructor();
		salary = 1000;
		System.out.println(DEPARTMENT +  salary);
		
		//local variables
		int num;
//		System.out.println(myObj1.num2);
		//calls a method to set num
		myObj.setNum(2);
		
		//calls a method to get num
		myObj.getNum();
	}
	
	
}
