package testProject;
// 7/28 실습문제 11
import java.util.Scanner;

public class Test31 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, sum;
		
		System.out.print("시작 숫자 :");
		num = sc.nextInt();
		System.out.print("공차 :");
		sum = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(num + " ");			
			num = num + sum;
			
		}
	}
}
