package testProject;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		float width, height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("가로 :");
		width = input.nextFloat();
		System.out.println("세로 :");
		height = input.nextFloat();
		System.out.println("면적 :" + (width * height));
		System.out.println("둘레 :" + (width + height) * 2);
	}
}
