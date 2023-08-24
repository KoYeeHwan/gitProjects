package testProject;

import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;             // a: 중간점수, b: 기말점수
		float total;				// c: 과제점수, d: 출석점수
		
		
		System.out.print("중간고사 점수 : ");
		a = sc.nextInt();
		
		System.out.print("기말고사 점수 : ");
		b = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		c = sc.nextInt();
		
		System.out.print("출석 점수 : ");
		d = sc.nextInt();
		
		System.out.println("결과 ");
		System.out.println("중간고사 점수(20) : " + (a*0.2));
		System.out.println("기말고사 점수(30) : " + (b*0.3));
		System.out.println("과제 점수(30) : " + (c*0.3));
		System.out.println("출석 점수(20) : " + (float)d);
		total = (a*0.2f) + (b*0.3f) + (c*0.3f) + d;
		
		System.out.println("총점 : " + total);
		
		if(total < 70)
			System.out.print("Fail 점수 미달");
		else if(((20 - d) >= 20 * 0.3))
			System.out.print("Fail [출석 미달]");
		else 
			System.out.print("Pass");			
			
	}

}
