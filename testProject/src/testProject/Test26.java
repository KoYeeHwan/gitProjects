package testProject;

import java.util.Scanner;

public class Test26 {
	
	public static void main(String[] args) {
		// ~부터 ~까지 반복해라
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("1 이상의 숫자를 입력하세요 :");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		
	}
}
