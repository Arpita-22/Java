
public class Student {
	private String name;
	double gpa;
	private static int studentCount = 0;
	
	public Student(String name, double gpa) {
		this.setName(name);
		this.gpa = gpa;
		studentCount++;
		System.out.println(studentCount);
	}
	
	public int getStudentCount() {
		return studentCount;
	}
	
	public boolean IsOnHonor() {
		if(gpa >= 3.5) return true;
		return false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}
}
