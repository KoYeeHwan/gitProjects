package testProject;

import java.util.Scanner;

public class Test35 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		while(true) {	
			System.out.println("정수 :");
			num = sc.nextInt();
		
			if(num < 1)
				System.out.println("양수가 아닙니다.");
			else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0)
						System.out.print("수");
					else
						System.out.print("박");
			}
				break;
		}	
			
	}
		}	
}
