package Homework5;

import java.util.Scanner;

public class Run {
	
	Scanner sc = new Scanner(System.in);
	//numbur이라는 변수에 int형 값을 하나 입력받아 출력해라 
	int num = sc.nextInt();
	int sum = 0;
	
	//입력받은 값 num이 100보다 작은 정수이면 "100이하" 출력
	//100이면 "100" 100이상이면 "100을 초과하였습니다. 다시 입력해주세요"를 출력한 후
	//100이하가 입력될때 까지 반복한다.
	
	if(num < 100) {
		System.out.println("100 이하");
	} else if(num == 100) {
		System.out.println("100");
	} else {
		System.out.println("100을 초과하였습니다 다시 입역해주세요.");
	}
	
	//1부터 입력받은 num값까지의 전부를 더한 값을 구해라
	// ex) num = 5일 때 1+2+3+4+5인 15출력      
	
	for(int i = 0; i < num; i++) {
		sum += (i + 1);
		System.out.println(sum);
	}
	
	//길이가 100인 int형 1차원배열 arr을 생성하고
	//1~num까지의 수를 순서대로 배열에 저장하고 출력해라
	
	int[] arr = new int[100];
	for(int i = 0; i < arr.length; i++) {
		arr[i] = i + 1;
	}
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] + " ");
	}
	System.out.println();
	//Book클레스를 작성해라
	//code(숫자), title(문자열), author(문자열)
	//모든 필드데이터를 초기화하는 생성자를 만들어라
	// getter,setter를 작성해라
	//toString메서드를 장성해라

	//메인메서드에서 Book객체를 10개 담을 수 있는 Book형 배열 BookList를 만들고
	//10개의 Book을 생성해서 저장해라
	//BookList의 모든 Book의 toString 메서드를 호출하여 저장이 잘 되었는지 확인해보자
}
