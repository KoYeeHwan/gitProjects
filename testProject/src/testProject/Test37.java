package testProject;

import java.util.Scanner;

public class Test37 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int[] arr1 = new int[10];
//		for(int i = 0; i <= 9; i++) {
//			arr1[i] = i + 1;
//			System.out.print(arr1[i] +" ");
//		}
		
		
//		int[] arr = new int[10];
//		for(int i = 0; i < 10; i++) {
//			arr[i] = (10 - i);
//			System.out.print(arr[i] + " ");
//		}
		

//		int num;
//		int arr[];
//		
//		System.out.print("양의 정수 : ");
//		num = sc.nextInt();
//		
//		 arr = new int[num];
//		
//		for(int i = 0; i < num; i++) {
//			arr[i] = i + 1;
//			System.out.print(arr[i] + " ");
//		}
		
		
//		String[] str = new String[5];
//		
//		str[0] = "사과";
//		str[1] = "귤";		
//		str[2] = "포도";
//		str[3] = "복숭아";
//		str[4] = "참외";
//		
//		System.out.print(str[1]);
		
		// Application
		String str; //검색할 문자열
		char ch; // 찾을 문자 하나
		int[] strLco; //위치값(인덱스) 저장
		int count = 0;
		
		System.out.print("문자열 : ");
		str = sc.next();
		
		System.out.print("문자 : ");
		ch = sc.next().charAt(0);
		
		//ch가 존재하는 위치 구하기
		System.out.print("application에 i가 존재하는 위치(인덱스) :");
		for(int i =0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.print(i + " ");
				
				count++;
			}
		}
		
		System.out.print(ch + " 개수 : " + count);
		
		
		
		
		
		
	}
}
