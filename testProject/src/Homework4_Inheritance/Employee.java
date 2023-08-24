package Homework4_Inheritance;

public class Employee extends Person{
	
	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, double weight, double height, int salary, String dept) {
		this.salary = salary;
		this.dept = dept;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String dept() {
		return dept;
	}
	
	public void srtDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString()	+ "," + salary + "," + dept;
	}
}
