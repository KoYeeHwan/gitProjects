package testProject;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int num = sc.nextInt();
		
		if(num % 2 == 0 )
			System.out.print("짝수다");
		else
			System.out.print("홀수다");
	}

}
