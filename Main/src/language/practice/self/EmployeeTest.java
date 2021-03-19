package language.practice.self;
import java.io.*;

public class EmployeeTest {
	public static void main(String[]args) {
		/*creating two objects using constructor*/
		
		Employee emp1 = new Employee("Adam");
		Employee emp2 = new Employee("Ix");
		
		/*Invoking methods for each object */
		
		emp1.setAge(45);
		emp1.setDesignation("Manager");
		emp1.setSalary(100000.00);
		emp1.printEmployee();
		
		emp2.setAge(20);
		emp2.setDesignation("specialist");
		emp2.setSalary(20000.00);
		emp2.printEmployee();
		
	}

}
