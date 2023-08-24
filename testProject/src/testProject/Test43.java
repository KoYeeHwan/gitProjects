package testProject;

import java.util.Scanner;

public class Test43 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Math.random() : 0보다 크고 1보다 작은 난수 발생
		// 값을 곱하고 int형으로 변환해서 정수형 난수를 발생시킬 수 있다.
		
		
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 10 + 1); 							
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		
		int max = 0, min =11;
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			max = (arr[i] > max) ? arr[i] : max;
			min = (arr[i] < min) ? arr[i] : min;
		}
		
		for (int i = 0; i < arr.length; i ++) {
			max = (arr[i] > max) ? arr[i] : max;
			min = (arr[i] < min) ? arr[i] : min;
			if (arr[i] > max) {
						max = arr[i];
			}
			
			if(arr[i] < min) {
						min = arr[i];
			}
		}	
			for (int i = 0; i < arr.length; i ++) {
				System.out.print(arr[i]);	
			}
			System.out.println();			
			System.out.println("최대값 :" + max);
			System.out.print("최소값 :" + min);
			
		
		
	}
}
