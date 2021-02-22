
import java.util.Scanner;

public class App {
	public static void main(String[]args) {
		String q1 = "color of sky?\n"+ "(a) red\n (b) blue\n";
		String q2 = "color of wood?\n" + "(a) brown\n (b)green\n" ;
		
		Question [] questions = {
				new Question(q1, "b"),
				new Question(q2, "a")
		};
		
		taketest(questions);
		
	}
	
	public static void taketest(Question []questions) {
		int score = 0;
		Scanner input = new Scanner (System.in);
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = input.nextLine();
			if(answer.equals(questions[i].answer)) {
				score++;
			}
		}
		System.out.println(score);
	}

}
