package language.practice.self;
import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;

	//constructor of class Employee
	public Employee(String name) {
		this.name = name;
	}
	
	//assigning the age of the Employee
	public void setAge(int Eage) {
		age = Eage;
	}
	
	//assigning designation
	public void setDesignation(String Edesignation) {
		designation = Edesignation;
	}
	
	//assigning salary
	public void setSalary(double Esalary) {
		salary = Esalary;
	}
	
	//print employee details
	public void printEmployee(){
		System.out.println(name + age + designation + salary);
		
	}
	
	
}
