
public class Student {
	String name;
	double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public boolean IsOnHonor() {
		if(gpa >= 3.5) return true;
		return false;
	}

}
