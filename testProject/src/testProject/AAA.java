package testProject;

import java.util.Scanner;

public class AAA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 100;

		System.out.print("1부터 num까지 모두 더한 합을 구해서 출력 :");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			sum -= i;
			System.out.print(sum);
		}

	}
}
