package KH.OOP;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int형 변수 num을 입력받으세요.
		int num = sc.nextInt();
		int sum = 0;
		// num이 홀수이면 홀수입니다. 짝수면 짝수입니다를 출력
		if (num % 2 == 0)
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");

		// 1부터 num까지 모두 더한 합을 구해서 출력

		for (int i = 0; i < num; i++) {
			sum += i;
			System.out.println(sum);
		}

		// num크기의 int형 배열을 만들고 0~(num - 1)까지의 인덱스에 1~num까지의 숫자를 저장하고
		// 모든 배열에 저장이 잘 되었는지 출력

		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();

		// Animal 추상클래스 작성

		// 필드 값 : String name, int age

		// 필드를 초기화하는 생성자 작성
		// 추상메서드 makeSound : 매게변수와 반환값(리턴값)이 없음

		// 인터페이스 Swimmable 작성
		// 추상메서드 swim :: 매게변수와 반환값(리턴값)이 없음

		// 인터페이스 Flyable 작성
		// 추상메서드 fly :: 매게변수와 반환값(리턴값)이 없음

		// Bird 클래스 작성
		// Animal을 상속받고, Flyable을 구현함
		// fly메서드에서는 "oo는 하늘을 날아다닌다." 출력

		// Fish 클래스 작성
		// Animal을 상속받고, Swimmable을 구현함
		// swim메서드에서는 "oo는 물을 헤엄친다" 출력 

		// 메인문에서 각각 객체를 하나 만들고 테스트 실행

		Animal bird = new Bird("파랑새", 47);
		bird.makeSound();
		((Flyable) bird).fly();

		Fish fish = new Fish("광어", 12);
		fish.makeSound();
		fish.swim();
	}
}
