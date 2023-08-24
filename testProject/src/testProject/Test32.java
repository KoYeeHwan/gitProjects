package testProject;

import java.util.Scanner;

public class Test32 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int num1, num2;
//		char operator;
//		
//		System.out.print("연산자 (+, -, *, /, %) :");
//		operator = sc.next().charAt(0);
//		System.out.print("정수1 : ");
//		num1 = sc. nextInt();
//		System.out.print("정수2 :");
//		num2 = sc.nextInt();
//		
//		if(operator == '+')
//			System.out.print(num1 + "+" + num2 + "=" + (num1+num2));
//		else if(operator == '-')
//			System.out.print(num1 + "-" + num2 + "=" + (num1-num2));
//		else if(operator == '*')
//			System.out.print(num1 + "*" + num2 + "=" + (num1*num2));
//		else if(operator == '/')
//			System.out.print(num1 + "/" + num2 + "=" + (num1/num2));
//		else if(operator == '%')
//			System.out.print(num1 + "%" + num2 + "=" + (num1%num2));
		
		int num1, num2;
		String oper;
		while(true) {
			System.out.println("연산자 (+, -, *, /, %) :");
		oper = sc.next();
		
		if (oper.equals("exit"))
			break;
		
		System.out.println("정수1 : ");
		num1 = sc. nextInt();
		System.out.println("정수2 :");
		num2 = sc.nextInt();
		
		switch(oper) {
			case "+":
				System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				}else {
					System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
				}break;
			case "%":
				System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
				break;
			default:
				System.out.println("프로그램을 종료합니다");
		}
		}
		
	}
}
