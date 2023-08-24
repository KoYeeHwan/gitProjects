package testProject;

import java.util.Scanner;

public class Elseif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		
		if(num >= 100)
			System.out.print("세자리수 이상입니다");
		else
			System.out.print("세자리수 미만입니다");
	}	

}
