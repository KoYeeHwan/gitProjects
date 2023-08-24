package testProject;

import java.util.Scanner;
// 크기가 4인 1차원 배열 3를 담고 있는 2차원배열을 만들어라 (자로형 : int)
public class Test46 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int[][] arr = new int[3][4];

		
//		for(int i = 0; i < arr[1].length; i++) {
//			arr[1][i] = 5;
//		}
		
//		arr[0][0] = 5;
//		arr[1][0] = 5;
//		arr[2][0] = 5;
		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i][0] =5;
//		}
//		
//		for(int i = 0; i < arr[0].length; i++) {
//			arr[0][i] = 5;
//		}
//		for(int i = 0; i < arr[1].length; i++) {
//			arr[1][i] = 5;
//		}
//		for(int i = 0; i < arr[2].length; i++) {
//			arr[2][i] = 5;			
//		}
//		// 2차원 배열 전체 초기화
//		for (int j = 0; j <arr.length; j++) {
//			for(int i = 0; i < arr[j].length; i++)
//				arr[j][i] = 5;
//		}
//		for (int j = 0; j <arr.length; j++) {
//			for(int i = 0; i < arr[j].length; i++)							
//		}			System.out.print(arr[j][i]);
//		

		
		//크기가 각각 4, 3, 5, 2인 1차원 배열들로 생성된 2차원 배열을 만들고 값을 전부 10으로 초기화
				
//		int[][] arr = {{10,10,10,10},{10,10,10},{10,10,10,10,10},{10,10}}; 
		
		//방법 1
//		String[][] arr = new String[3][3];
//		arr[0][0] = "(0,0)";
//		arr[0][1] = "(0,1)";
//		arr[0][2] = "(0,2)";
//		
//		arr[1][0] = "(1,0)";		
//		arr[1][1] = "(1,1)";
//		arr[1][2] = "(1,2)";
//		
//		arr[2][0] = "(2,0)";
//		arr[2][1] = "(2,1)";
//		arr[2][2] = "(2,2)";
//		
//		//방법 2
//		String[][] arr= {
//			{"(0,0)","(0,1)","(0,2)"},
//			{"(1,0)","(1,1)","(1,2)"},
//			{"(2,0)","(2,1)","(2,2)"},
//		};
		
		//방법 3
//		for(int j = 0; j < arr[0].length; j++) {
//			arr[0][i] = "(0,"i+")";
//		}
//		
//		for(int i = 0; i < arr[1].length; i++) {
//			arr[1][i] = "(0,"i+")";
//		}
		char ch = 'a';	
		char[][] arr = new char[3][3];
		//방법 1
//		arr[0][0] = ch++;	
//		arr[0][1] = ch++;
//		arr[0][2] = ch++;
//		
//		arr[1][0] = ch++;
//		arr[1][1] = ch++;
//		arr[1][2] = ch++;
//		
//		arr[2][0] = ch++;
//		arr[2][1] = ch++;
//		arr[2][2] = ch++;
//		
//		//방법 2
//		String[][] arr = {
//				{"(a)","(b)","(c)"},
//				{"(d)","(e)","(f)"},
//				{"(G)","(h)","(i)"},
//		}
		//방법 3
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for( int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
				
	}
}	
