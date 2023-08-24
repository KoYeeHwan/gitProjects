package testProject;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 :");
		age = sc.nextInt(); //입력 받는것
		
		if(age <= 13)
			System.out.print("어린이");
		else if (age > 13 && age  <= 19)
			System.out.print("청소년");
		else 
			System.out.print("성인");
		
			
		
	}	
			
}
