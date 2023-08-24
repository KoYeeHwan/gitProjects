package testProject;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		float insen; 
		
		System.out.print(" A사원의 연봉: ");
		a = sc.nextInt();
		
		System.out.print(" B사원의 연봉: ");
		b = sc.nextInt();
		
		System.out.print(" C사원의 연봉: ");
		c = sc.nextInt();
		
		System.out.println("A사원의 연봉/연봉 + a: " + (a+ (a * 0.4)));
		System.out.println((a+ (a * 0.4)) >= 3000? "3000이상" : "3000미만");
		System.out.println("B사원의 연봉/연봉 + a: " + (float)b);
		System.out.println(b >= 3000 ? "3000이상" : "3000미만" );
		System.out.println("C사원의 연봉/연봉 + a: " + (c+ (c * 0.15)));
		System.out.println(c + (c * 0.15) >= 3000 ? "3000이상" : "3000미만" );
		if(a <= 3000 );
	}

}
