package testProject;

import java.util.Arrays;
import java.util.Scanner;

public class Chap3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 길이가 5인 int형 1차원 배열 생성
//		int[] ar1 = new int[5];
//		
//		//길이가 7인 double형 1차원 배열 ar2 생성
//		double[] ar2 = new double[7];
//		
//		// 배열의 변수선언과 메모리할당을 분리하여 길이가  9인 float형 배열 ar3생성
//		float[] ar3;
//		ar3 = new float[9];
//		
//		// 배열의 길이를 구하는 방법
//		System.out.println("ar1의 길이 :" + ar1.length);
//		System.out.println("ar2의 길이 :" + ar2.length);
//		System.out.println("ar3의 길이 :" + ar3.length);
//		
//		String str = "yeehwan";
//		System.out.println("str의 길이 : " + str.length());
		
//		String str[] = new String[5];
//		str[0] = "jiwon";
//		str[1] = new String("cafe");		
//		str[2] = "tree";
//		str[3] = "choi";
//		str[4] = "hi";
//		
//		int count = 0;
//		st.length();
//		for (int i = 0; 1< str.length; i++) {
//			count += str[i].length();
//		}
//		System.out.println("총 문자의 수는" + count);
		
		//얕은 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = arr1;
//		arr2[2] = 0;
//		System.out.print(arr1[2]);
		
		//완전한 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = new int[5];
				
		
		
//		for(int i = 0; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
		//반복문을 통해서 arr1, arr2에 있는 모든 요소 출력
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.print("arr1[" + i + "] :" + arr1[i]);
//		}
		
		//보편적인 배열 복사방법
//		arr2 = arr1.clone();
//		
//		//배열 arr1을 전부 7로 초기화
//		Arrays.fill(arr1, 7);
		
		/*
		 *  1. 배열형식의 참조변수 선언
		 *  2. 배열객체 할당
		 *  3. 배열 데이터 초기화
		 *  4. 배열 데이터 활용
		 */
		
//		int[] ref;
//		ref = new int[6];
//		ref[0] = 1;
//		ref[1] = 2;
//		ref[2] = 3;
//		ref[3] = 4;
//		ref[4] = 5;
//		ref[5] = 6;		
//		
//		// 반복문을 이용해서 배열 초기화
//		for (int i = 0; i < ref.length; i++)
//			ref[i] = i + 1;
//		
//		// 반복문을 이용해서 배열 출력
//		for (int i = 0; i < ref.length; i++)				
//		System.out.print(ref[i]);
		
		
		// int형 변수 num을 생성하고 값을 10으로 초기화
		
		// String형 변수 str을 생성하고 값을 "hi"로 초기화
		
		// num과 str을 출력
		
		// 만약 num이 5보다 크다면 "num은 5보다 큰 수입니다" 출력
		// 더 작다면 "num은 5보다 작은 수 입니다" 출력
		// 5라면 "num은 5입니다" 출력
		
		int num = 10;
		String str = "hi";
		
		System.out.println(num);
		System.out.println(str);
		
		if(num > 5) {
			System.out.print("num은 5보다 큰 수입니다");
		}else if(num < 5) {
			System.out.print("num은 5보다 작은 수 입니다");
		}else {
			System.out.print("num은 5입니다");
		}
		
		
		// 반복문을 활용하여 1~num까지 숫자를 순차적으로 출력
		// ex) num = 3일때 1 2 3 출력
		// for while각각 작성
		
		for (int i = 0; i <= num; i++)
			System.out.print(i);
		
		int i = 0;
		while(i <= num) {
			System.out.print(i);
			i++;
		}
		
		// 길이가 20인 int형 배열 arr생성 후 반복문을 이용하여 값을 1~20까지 순차적으로 초기화
		int[] arr = new int[20];
		for (int i =1; i <= arr.length; i++) {
			arr[i - 1] = i;
		}
		
		// 반복문을 이용하여 arr 요소 전체 출력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.print(i);
		}
		
		// String형 길이가 5인 배열을 생성하고 생성과 동시에 {"사과", "포도", "귤", "파인애플", "바나나"}로 초기화
		String[] arr2 = {"사과", "포도", "귤", "파인애플", "바나나"};
		
		// 반복문을 이용하여 arr2 요소 전체 출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
		
		
		
		
		
		
	}
}
