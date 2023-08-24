package testProject;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		char operator;
		
		System.out.print("피연산자1 입력: ");
		a = sc.nextInt();
		System.out.print("피연산자2 입력: ");
		b = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%): ");
		operator = sc.next().charAt(0);
		
//		if( a > 0 && b > 0)
//		
//		if(operator == '+')
//			System.out.print(a + "+" + b + "=" + (a+b));
//		else if(operator == '-')
//			System.out.print(a + "-" + b + "=" + (a-b));
//		else if(operator == '*')
//			System.out.print(a + "*" + b + "=" + (a*b));
//		else if(operator == '/')
//			System.out.printf("%d %c %d = %.6f \n", a, operator, b, ((double)a/b));
//			System.out.print(a + "/" + b + "=" + ((double)a/b));
//		else if(operator == '%') 
//			System.out.print(a + "%" + b + "=" + (a+b));
//		else
//			System.out.print("잘못 입력하셨습니다.");
//		
//		else 
//			System.out.print("잘못 입력하셨습니다.");
//		
		
		if( a > 0 && b > 0) {	
			switch(operator) {
			case '+' :
				System.out.print(a + "+" + b + "=" + (a+b));
				break;
			case '-' :
				System.out.print(a + "-" + b + "=" + (a-b));
				break;
			case '*' :
				System.out.print(a + "*" + b + "=" + (a*b));
				break;
			case '/' :
				System.out.print(a + "/" + b + "=" + ((double)a/b));
				break;
			case '%' :
				System.out.print(a + "%" + b + "=" + (a+b));
				break;
			default :
				System.out.print("잘못 입력하셨습니다.");
			}
		}
		
		
	}
}
