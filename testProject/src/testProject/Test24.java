package testProject;

import java.util.Scanner;

public class Test24 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;		
		
		System.out.println("1 이상의 숫자를 입력하세요 :");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {	
			System.out.print(i + 1);			
		if(num < 1) 
			System.out.print("1 이상의 숫자를 입력하세요");
			System.out.print(" ");
//		int i = 1;	
//		while(i <= num) {			
//			i++;
//			System.out.println(i);
//		   }
//		}
	}
}}
