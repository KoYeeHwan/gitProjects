package testProject;

import java.util.Scanner;

//아이디,비밀번호를 정해두고 로그인 기능을 작성하세요.
//로그인 성공 시 "로그인 성공", 아이디가 틀렸을 시 "아이디가 틀렸습니다."
//비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다."를 출력하세요.
public class Test18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final String MY_ID, MY_PSW;
		MY_ID = "myId";
		MY_PSW = "mypassword12";

		String id, psw;

		System.out.print("아이디 :");
		id = sc.next();
		System.out.print("비밀번호 :");
		psw = sc.next();

		if (MY_ID.equals(id) && MY_PSW.equals(psw)) {
			System.out.print("로그인 성공");
		} else {
			if (!MY_ID.equals(id)) {
				System.out.print("아이디가 틀렸습니다.");
			} else if (!MY_PSW.equals(psw)) {
				System.out.print("비밀번호가 틀렸습니다.");
			}
		}
		if (!MY_ID.equals(id)) {
			System.out.print("아이디가 틀렸습니다.");
		} else if (!MY_PSW.equals(psw)) {
			System.out.print("비밀번호가 틀렸습니다.");
		} else {
			System.out.print("로그인 성공");
		}

		switch (id) {
		case "myId": {
			switch (psw) {
			case "myPassword12":
				System.out.print("로그인 성공");
				break;
			default: {
				System.out.print("비밀번호가 틀렸습니다");

			}
			}
		}
		}
	}

}