package testProject;

import java.util.Scanner;

public class Test23 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("권한 확인");
//		System.out.print("BMI");
//		System.out.print("계산기");
//		System.out.print("P/F");
		
		
		int dan = 2;
		for (int i = 0; i <= 9; i++) { // i는 지역변수
			
			System.out.println(dan + " * " + i + " = " + (i * dan));
		}
		
	}

}
