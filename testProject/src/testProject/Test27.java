package testProject;

import java.util.Scanner;

public class Test27 {
	public static void main(String[] args) {
		// 숫자 하나를 입력 받고 입력 받은 수부터  ~1까지 순차적으로 출력해라
		Scanner sc = new Scanner(System.in);
		
//		int num = 0;
//		while(num < 1) { // num이 1이상의 숫자가 나올때 까지 반복
//			
//		System.out.print("1이상의 숫자를 입력하세요 :");
//		num = sc.nextInt();
//		
//		if (num > 0)
//		for(int i = num; i >= 1; i--) {
//			System.out.print(i + " ");
//			  
//				
//			}
//		}
//		for (int num = 0; num < 1; num = sc.nextInt()) {	
//			System.out.print("1이상의 숫자를 입력하세요 :");		
//			
//			if (num > 0) {
//			for(int i = num; i >= 1; i--) {
//				System.out.print(i + " ");
//				  
//					}
//				} else {
//					System.out.print("1이상의 숫자를 입력해주세요");
//				}
//			}
		
//		int num;
//		
//			System.out.print("1이상의 숫자를 입력하세요 :");
//			num = sc.nextInt();
//			
//			if(num < 1)
//				System.out.print("1이상의 숫자를 입력해주세요");
//			
//			for(int i = 1; i <= num; i++)
//				System.out.print(i + " ");
			
//		int num;
//		
//			System.out.print("1이상의 숫자를 입력하세요 :");
//			num = sc.nextInt();
//			
//			if(num < 1) {
//				While(num < 1) {
//					System.out.print("1이상의 숫자를 입력해주세요.");
//					System.out.print("1이상의 숫자를 입력하세요 :");
//				num = sc.nextInt();
//				}
//				for(int i=1; i<= num; i++)
//					System.out.print(i + " ");
//			}
//				for(int i=1; i<= num; i++)
//					System.out.print(i + " ");
			
//		int num, sum = 0;
//					
//			System.out.print("정수를 하나 입력하세요 :");
//		num = sc.nextInt();
//			
//			for(int i = 1; i <= num; i++) {
//				sum = sum + i;
//
//				if (i == num)
//					System.out.print(i + " = " + sum);
//				else
//					System.out.print(i + " + ");
//			}
			//자료형[] 배열이름; //배열의 선언
			//배열이름 = new 자료형 [길이]; // 배열의 메모리 생성
//			int[] ar = new int [3];
			
//			ar[0] = 7;     //값의 저장: 첫 번째 요소
//			ar[1] = 8;     //값의 저장: 두 번째 요소
//			ar[2] = 9;	   //값의 저장: 세 번째 요소
//			
//			int num = ar[0] + ar[1] + ar[2];   
//			System.out.print(num);
				
						
//			int dan;
//			
//			System.out.print("숫자 :");
//			dan = sc.nextInt();
//			
//			System.out.print("=====" + dan +"단 ===== ");
//			
//			for( int i = 1; i <= 9; i++) {
//				System.out.println(dan + "*" + i + "=" + (i * dan));
//			}
			
			
			int dan;
			
			System.out.print("숫자 :");
			dan = sc.nextInt();
						
			for (int j = dan; j < 10 ; j++) {
				if(dan > 10);
				System.out.print("9 이하의 숫자만 입력해주세요.");
				break;
			}	
				System.out.println("=====" + j +" 단 ===== " );
				
				for( int i = 1; i <= 9; i++) {
					System.out.println(dan + " * " + i + " = " + (j * i));
			}		
		}
			
			if(dan < 10);
				System.out.print("9 이하의 숫자만 입력해주세요.");
			
	  }	
}
