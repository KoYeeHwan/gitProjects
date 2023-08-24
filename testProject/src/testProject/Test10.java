package testProject;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
						
		String name;
		char gender;
		int age, Class, num;
		float result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 :");
		name = sc.nextLine();
		System.out.print("학년(숫자만) :");
		age = sc.nextInt();
		System.out.print("반(숫자만) :");
		Class = sc.nextInt();
		System.out.print("번(숫자만) :");
		num = sc.nextInt();
		System.out.print("성별(M/F) :");
		gender = sc.next().charAt(0); 
		System.out.print("성적(소수점 아래 둘째자리까지) :");
		result = sc.nextFloat();
		
		if(gender == 'M')
			System.out.print("남학생 :");
		else
			System.out.print("여학생 :");
		System.out.print(age + "학년 " + Class + "반 " + num + "번 " + name +" "+gender+ "의 성적은 "+result+"이다." );
	}
}
