package testProject;

import java.util.Scanner;
// 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는
// 권한을 출력하세요. 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회,
// 댓글 작성이 가능하고 회원은 게시글 작설, 게시글 조회, 댓글 작성이 가능하고
// 비회원은 게시글 조회만 가능합니다.
public class Test19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a;  // a = 관리자
		
		System.out.print("권한을 확인하고자 하는 회원 등급:");
		a = sc.next();
		if(a.equals("관리자"))
			System.out.print("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
		else if (a.equals("회원"))
			System.out.print("게시글 작성, 게시글 조회, 댓글");
		else if (a.equals("비회원"))
			System.out.print("게시글 조회");
		else
			System.out.print("잘못 입력하셨습니다.");
		
		 switch(a) {
			case "관리자" :
				System.out.print("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
				break;
			case "회원" :
				System.out.print("게시글 작성, 게시글 조회, 댓글");
				break;
			case "비회원" :
				System.out.print("게시글 조회");
			default:
				System.out.print("잘못 입력하셨습니다.");
		 }	
				
	}	

}
