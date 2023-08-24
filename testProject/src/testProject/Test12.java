package testProject;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, total;
		float avg;
		System.out.print("국어 : ");
		a = sc.nextInt();
		System.out.print("영어 : ");
		b = sc.nextInt();
		System.out.print("수학 : ");
		c = sc.nextInt();
		total = a + b + c;
		avg = total / (float)3;
		
		System.out.print("합계: " + total);	
		System.out.print(" 평균: " + avg);
		
		System.out.print("");
		if(a >= 40 && b >= 40 && c >= 40 && avg >= 60)
			System.out.print(" 합격");
		else
			System.out.print(" 불합격");
		
		
	}
}
