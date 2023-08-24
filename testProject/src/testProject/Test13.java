package testProject;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		String num;
		
		System.out.print("주민번호를 입력하세요(- 포함) :");
		num = sc.next(); 
		
		if (num.charAt(7) == '1' && num.charAt(7) == '3')
			System.out.print("남자 :");
		else
			System.out.print("여자 :");
		
		
		
		
	}
}
