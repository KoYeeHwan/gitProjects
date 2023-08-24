package testProject;

import java.util.Scanner;

public class Test30 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, max, min;
		
		
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
			
			for (int i = min; i <= max; i++) {
				System.out.print(i + " "); 				 
			}	
			}else {
				System.out.print("1 이하의 숫자만 입력해주세요.");
			}
		}
	}

