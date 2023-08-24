package testProject;

import java.util.Scanner;

public class Test50 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자형 변수 str을 생성하고 "안녕하세요"로 초기화한다.
		// 만약 str의 있는 값이 "hi" 라면 "hi" 아니라면 str의 들어있는 값을 출력한다.
		// 길이가 8인 정수형 1차원 배열 arr을 생성하고 값을 전부 5로 초기화한다.
		// arr에 들어 있는 데이터를 전부 출력한다.
		// 3행 2열의 char형 2차원 배열 arr2를 생성하고 a~f를 순차적으로 초기화한다.
		// arr2에 들어있는 데이터를 전부 출력한다.
		
		String str = "안녕하세요";		
		
		if(str.equals ("hi")) {
			System.out.print("hi"); 
		}else {
			System.out.print(str);
		}
		
		int[] arr = new int[8];
		for(int i = 0; i < arr.length; i++)
			arr[i] = 5;
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		char[][] arr2 = new char[3][2];
		
		char ch = 'a';
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr2[i].length; j++) {
				arr2[i][j] = ch++;
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for( int j = 0; j < arr2[i].length; j++)	{
				System.out.print(arr2[i][j]);
			}
		}
		
		
		
	}
}
