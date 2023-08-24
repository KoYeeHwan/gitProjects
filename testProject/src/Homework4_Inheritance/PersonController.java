package Homework4_Inheritance;

public class PersonController {

	private Student[] s = new Student[3];
	private int studentCount = 0;
	
	private Employee[] e = new Employee[10];
	private int employeeCount = 0;
	
	// 각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
	public int[] personCount() {
		return new int[] {studentCount, employeeCount};				
	}
	
	// 매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메소드
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		if(studentCount < s.length) {
			s[studentCount] = new Student(name, age, height, weight, grade, major);
			studentCount++;
		}
	}
	
	// 학생 객체 배열의 주소를 반환하는 메소드
	public Student[] printStudent() {
		return s;
	}
	
	// 매개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장되는 메소드
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		if(employeeCount < e.length) {
			e[employeeCount] = new Employee(name, age, height, weight, salary, dept);
			employeeCount++;
		}
	}
	
	//사원 객체 배열의 주소를 반환하는 매소드
	public Employee[] printEmployee() {
		return e;
	}
}
