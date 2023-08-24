package testProject;

import java.util.Scanner;

public class Test44 {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[10];
		int i = 0;
		while(i < arr.length) {
			
			int nan = (int)(Math.random() * 10 + 1);
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == nan) {
					nan = 0;
					break;
				}
			}
			
			if (nan == 0)
				continue;
			else {
				arr[i] = nan;
				i++;
			}	
			
				
		}	
		
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}
}
