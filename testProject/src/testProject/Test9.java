package testProject;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		int man, number;
		System.out.print("인원 수 :");
		man = sc.nextInt();
		System.out.print("사탕 개수 :");
		number = sc.nextInt();		
		System.out.println("1인당 사탕 개수 :" + number / man);
		System.out.print("남는 사탕 개수 :" + (number % man));
		 
	}

}
