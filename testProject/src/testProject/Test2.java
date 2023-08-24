package testProject;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int num;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수: ");
		num = sc.nextInt();
		System.out.println("두 번째 정수: ");
		num2 = sc.nextInt();
	
		System.out.println("더하기 결과:" + (num + num2));
		System.out.println("빼기 결과:" + (num - num2));
		System.out.println("곱하기 결과:" + (num * num2));
		System.out.println("나누기 결과:" + (num / num2));
		
		
		
	}
}
