package KH.OOP4;

public class Student {
	private String name;
	private int age;
	private int grade;
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return this.name + " " + this.age + " " + this.grade;
	}
	
	
}
