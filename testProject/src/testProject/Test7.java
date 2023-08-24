package testProject;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0)
			System.out.print("양수다");
		else if (num == 0)
			System.out.print("0이다");
		else
			System.out.print("양수가 아니다");
		
		
	}
}
