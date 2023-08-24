package testProject;

import java.util.Scanner;

public class Test39 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int len, sum = 0;
		int[] arr;
		
		System.out.print("정수 :");
		len = sc.nextInt();
		arr = new int[len];	
		
		for(int i = 0; i < len; i++) {
			System.out.println("배열 "+i+ "번째 인덱스에 넣을 값 :");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < len; i++) {
			sum += arr[i];
			System.out.print("");
			arr[1] = sc.nextInt();
		}
		
		for(int i = 0; i < len; i++) {
			System.out.println("배열 2번째 인덱스에 넣을 값 :");
			arr[2] = sc.nextInt();
		}
		
		for(int i = 0; i < len; i++) {
			System.out.println("배열 3번째 인덱스에 넣을 값 :");	
			arr[3] = sc.nextInt();
		}
		
		for(int i = 0; i < len; i++) {
			System.out.println("배열 4번째 인덱스에 넣을 값 :");
			arr[4] = sc.nextInt();
		}
			
	
		
	}
}
