package testProject;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float a, b, c, total;
		
		System.out.print("국어: ");
		a = sc.nextFloat();
		System.out.print("영어: ");
		b = sc.nextFloat();
		System.out.print("수학: ");
		c = sc.nextFloat();
		total = a + b + c;
		System.out.print("총점: " + (int)total);	
		System.out.print("평균: " + (int)(total / 3));
		
	}
}
