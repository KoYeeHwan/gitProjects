package testProject;

import java.util.Scanner;

public class Text17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, total;
		float avg;
		
		System.out.print("국어점수 : ");
		a = sc.nextInt();
		System.out.print("영어점수 : ");
		b = sc.nextInt();
		System.out.print("수학점수 : ");
		c = sc.nextInt();
		total = a + b + c;
		avg = total / (float)3;

		System.out.print("합계: " + total);	
		System.out.print("평균: " + avg);
		
		System.out.print("");{
		if(a >= 40 && b >= 40 && c >= 40 && avg >= 60)
			System.out.println("국어 : "+ a);
			System.out.println("수학 : "+ b);
			System.out.println("영어 : "+ c);
			System.out.println("합계 : "+ total);
			System.out.println("평균 : "+ avg);
			System.out.println("축하합니다 합격입니다!");
		} else {
			System.out.println("불합격");
		}
		
		
	}
}
