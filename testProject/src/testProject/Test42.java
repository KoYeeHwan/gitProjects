package testProject;

import java.util.Scanner;

public class Test42 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String str;
		char[] st;
		
		System.out.print("주민등록번호(- 포함) :");
		str= sc.next();
		st = new char[str.length()];
				
		for (int i= 0; i < str.length(); i++) {
			if(i >= 8) {
				st[i] = '*';
				continue;
			}			
			st[i] = str.charAt(i);
		}
		
		for (int i= 0; i < str.length(); i++) {
			
			System.out.print(st[i]);
		}
		
		
	}
}
