package testProject;

import java.util.Scanner;

public class Test29 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, min, max;
		
		System.out.print("첫 번째 숫자 :");
		num1 = sc.nextInt();
		System.out.print("두 번째 숫자 :");
		num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			
			if (num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
				
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요. :");
		}
		
		
	}

}
