package testProject;

import java.util.Scanner;

public class Text28 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, sum = 0;

		System.out.print("정수를 하나 입력하세요 :");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			sum = sum + i; // sum += i;
			if (i == num)
				System.out.print(i + " = " + sum);
			else
				System.out.print(i + " + ");
		}

	}
}
