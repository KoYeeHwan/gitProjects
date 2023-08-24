package testProject;

import java.util.Scanner;

public class AA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num;
//		
//		System.out.println("정수 :");
//		num = sc.nextInt();
//		
//		if(num > 0)
//			System.out.print("양수다.");	
//		else if(num == 0)
//			System.out.print("0이다.");
//		else 		
//			System.out.print("음수다.");
//			
		
		
//		int num;
//		
//		System.out.print("정수 :");
//		num = sc.nextInt();
//		
//		if(num % 2 == 0)
//			System.out.print("짝수다");
//		else
//			System.out.print("홀수다");
		
		
				
		
//		int a, b;
//		
//		System.out.print("인원 수 :");
//		a = sc.nextInt();
//		System.out.print("사탕 개수 :");
//		b = sc.nextInt();
//		System.out.println("1인당 사탕 개수 :" + (b / a));
//		System.out.print("남는 사탕 개수 :" + (b % a));
	
		
		
		
		
		
		
		
		// 1 ~10 사이의 정수를 하나 입력받아 홀수인지 짝수인지 나타내는 프로그램을 작성하세요.
		//ex) 정수 : 3
		//    홀수입니다.
		int num;
		(num >= 1 && num <= 10);
		System.out.print("정수 :"	);
		num = sc.nextInt();
		
		if(num % 2 == 0)
			System.out.print("짝수입니다.");
		else
			System.out.print("홀수입니다");
		
		// 1~ 50사이의 정수 n을 입력받아 1부터 n까지 순서대로 출력하세요.
		// ex) 정수 : 5
		// 		1
		//		2
		//		3
		//		4
		//		5
		
		int n;
		
		System.out.println("정수 :");
		n = sc.nextInt();
		
		if(n < 1 || n >50)
			System.out.print("1~50사이의 정수를 입력해주세요.");
		else {
			for(int i = 1; i <= n; i++)
				System.out.println(i);
		}
	
		// 크기가 10인 1차원배열 arr을 생성하고 11 ~ 20까지의 숫자를 반복문을 사용해서 순차적으로 대입해라
				
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 11;
		}
	
	}
}
