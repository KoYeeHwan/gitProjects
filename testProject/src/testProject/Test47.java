package testProject;

import java.util.Scanner;

public class Test47 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][4];
		int num = 1;
		//방법 1
		arr[0][0] = num++;
		arr[0][1] = num++;
		arr[0][2] = num++;
		arr[0][3] = num++;
		
		arr[1][0] = num++;
		arr[1][1] = num++;
		arr[1][2] = num++;
		arr[1][3] = num++;
		
		arr[2][0] = num++;
		arr[2][1] = num++;
		arr[2][2] = num++;
		arr[2][3] = num++;
		
		arr[3][0] = num++;
		arr[3][1] = num++;
		arr[3][2] = num++;
		arr[3][3] = num++;
		num = 1;
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
					arr[i][j] = num++;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
}
