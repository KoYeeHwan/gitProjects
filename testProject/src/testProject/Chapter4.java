package testProject;

import java.util.Scanner;

public class Chapter4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("프로그램의 시작");		
//		hiEverone(12);
//		hiEverone(13);
//		System.out.println("프로그램의 끝");
//		
//		System.out.println("프로그램의 시작");	
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 " + age + "세 입니다.");
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 " + 13 + "세 입니다.");
//		System.out.println("프로그램의 끝");
//	}
//	public static void hiEverone(int age) {
//		int age = 
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 " + age + "세 입니다.");
//		
//			
//		public static void main(String[] args) {
//			double myHeight = 175.9;
//			hiEverone(12, 12.5);
//			hiEverone(13, myHeight);
//			byEverone();			
//		}
//		public static void hiEverone(int age, double height) {
//			System.out.println("제 나이는" + age + "세 입니다.");
//			System.out.println("저의 키는" + height + "cm 입니다.");
//		}
//		
//		public static void byEverone() {
//			System.out.println("다음에 뵙겠습니다.");
//		}
		
		
//		메섣, 설정값, 리턴형식, 메서드이름(매게변수)
//		실핼할 코드
//		return 값;
//		
//		public static void main(String[] args) {
//			int result;
//			result = adder(4, 5);
//			System.out.println("4 + 5 =" + result);
//			System.out.println("3.5 * 3.5 = " + square(3.5));
//		}
//		
//		public static int adder(int num1, int num2) {
//			int addResult = num1 + num2;
//			return addResult;
//		}
//		
//		public static double square(double num) {
//			return num * num;
//		}	

//
//		System.out.print(factorial(3));
//		}
//		
//		
//		public static int factorial(int n) {
//		if( n == 1)
//			return 1;
//		else
//			return n * factorial(n-1); 
//		}	
//		
//		
//		
//		
//		
//		{

	
//	BankAccount yoon = new BankAccount();
//	BankAccount park = new BankAccount();
//	BankAccount tmp;
//	
//	String s = "hi";
//	String t = "hi";
//	System.out.println(yoon.balance);
//	System.out.println(park.balance);
//	
//	yoon.deposit(1000);
//	park.deposit(2000);
//	
//	tmp = yoon;
//	yoon = park;
//	park = tmp;
//	tmp = null;
//	yoon.checkMybalance();
//	park.checkMybalance();
//	}
//}
//	class BankAccount {
//		int balance = 0;  			//예금 잔액
//		
//		public int deposit(int amount) {
//			balance += amount;
//			return balance;
//		}
//		public int withdraw(int amount) {
//			balance -= amount;
//			return balance;
//		}
//		public int checkMybalance() {
//			System.out.println("잔액 :" + balance);
//			return balance;
//		}
//	}
	}	BankAccount yoon = new BankAccount();
//기본 생성자로 객체 생성 해서 이름, 잔액 출력
		
		BankAccount choi = new BankAccount();
		
		//매개 변수가 2개인 생성자로 객체 생성하고 이름, 잔액 출력
		
		BankAccount kim = new BankAccount(10000, "김지원"	);
		
	}
class BankAccount {
	int balance;
	String name;
	public BankAccount() {
		balance = 0;
		name = "이름 없음";
		
	}
	
	public BankAccount(int b, String n) {
		balance = b;
		name = n;
	}
		
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
		
	public int checkMybalance( ) {
		System.out.print("잔액" + balance);
		return balance;
		System.out.print();
	}
		
	}

		

