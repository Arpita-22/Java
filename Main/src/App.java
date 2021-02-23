import java.util.ArrayList;

public class App {
	
	public static void main(String[]args) {	
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(10);
		Double mydouble = 3.5;
		System.out.println(mydouble);
		System.out.println(mydouble.doubleValue());
		for(int i: num) {
			System.out.println(i);
		}
		
	}

}



