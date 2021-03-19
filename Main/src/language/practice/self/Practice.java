package language.practice.self;

//enum
class Juice{
	enum JuiceSize{SMALL, MEDIUM, LARGE}
	JuiceSize size;
}

public class Practice {
	enum JuiceSize{SMALL, MEDIUM, LARGE}
	public static void main(String[]args) {
		System.out.println("Hello World");
		Juice myVar = new Juice();
		myVar.size = Juice.JuiceSize.LARGE;
		System.out.println(myVar.size);
	}

}

//class
 class Dog{
	String breed;
	int age;
	String color;
	
	void barking() {
		System.out.println("bark");
	}
	void wagging() {
		
	}
	
}
