package KH.OOP5;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int형 변수 num을 입력받으세요
		// num아 10보다 크면 "10초과" 작거나 같으면 "10 이하" 출력
		int num = sc.nextInt();
		sc.nextLine();
		int sum = 1000;

		if (num > 10) {
			System.out.println("10 초과");
		} else {
			System.out.println("10 이하");
		}

		// 1000에서 1부터 num까지 순서대로 전부 뺸 값을 출력

		for (int i = 0; i < num; i++) {
			sum -= i;
			System.out.println(sum);
		}

		// num크기의 int형 배열을 만들고 모든 인덱스에 num의 숫자를 저장하고
		// 모든 배열에 저장이 잘 되었는지 출력

		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num;
		}	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Human kim = new Student("김민수", 20);
		kim.makeSound();
		((Student)kim).sleep();
		((Student)kim).swim();
	}
}
