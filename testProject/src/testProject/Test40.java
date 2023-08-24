package testProject;

import java.util.Scanner;

public class Test40 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, count = 0;
		int[] arr;
		
		while(true) {
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		if(num % 2 == 1 && num >= 3) {
					
		
		arr = new int[num];
		// 0 ~ (n -1)까지 반복 중간값까지는 1부터 1씩 늘려 저장 중간 이후는 1씩 빼서 저장
		for(int i =0; i < arr.length; i++) {
			if((arr.length / 2) < i) {
				count--;
			}else {
				count++;
			}
			arr[i] = count;
		}	
			for(int i =0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}	
			break;
		}	else {
				System.out.println("다시 입력하세요. ");
		}
	}
	}
}
