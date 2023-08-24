package testProject;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String year, month, day, hour, min, sec;
		
		System.out.print("년");
		year = sc.nextLine();		
		System.out.print("월");
		month = sc.nextLine();
		System.out.print("일");
		day = sc.nextLine();
		System.out.print("시");
		hour = sc.nextLine();
		System.out.print("분");
		min = sc.nextLine();
		System.out.print("초");
		sec = sc.nextLine();
		System.out.print("지금은 "+year + "년 "+ month + "월 "+ day + "일 "+hour + "시 "+min + "분 "+ sec + "초" + "입니다.");
		
	}
}
