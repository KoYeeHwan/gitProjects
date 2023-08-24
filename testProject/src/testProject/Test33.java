package testProject;

import java.util.Scanner;

public class Test33 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("정수 입력 :");
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int j = 0; j < i; j++ ) {
				System.out.print("*");
				
			}
			System.out.println("  ");
			
		}
	}
}
