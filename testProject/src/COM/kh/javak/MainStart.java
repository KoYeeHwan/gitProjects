package COM.kh.javak;
import java.util.Scanner;

import COM.kh.javai.Customer;
import COM.kh.javai.Student;

public class MainStart {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		//길이가 10인 Customer 객체배열을 생성하고
		//0번째 인덱스값에 id : myId, password : myPassword12로 객체생성 (이름 이메일 자유)
		Customer[] customerArr = new Customer[10];
		customerArr[0] = new Customer("김소망", "myId", "myPassword12", "asd123@naver.com");
		
		//++--------------------회원가입--------------------
		//아이디, 비밀번호, 이름, 이메일을 입력받아 Customer 객체를 추가해보자
		/*
		 * 아이디를 입력하세요 : 
		 * 비밀번호를 입력하세요 :
		 * 이름을 입력하세요 :
		 * 이메일을 입력하세요 :
		 * 
		 * 이름 : ooo
		 * 이메일 : ooo
		 * Id : ooo
		 * Password : ooo
		 * 회원정보가 정상적으로 등록되었습니다.
		 */
		
		for (int i = 0; i < customerArr.length; i++) {
			if(customerArr[i] == null) {
				System.out.print("아이디를 입력하세요 :");
				id = sc.next();
				System.out.print("비밀번호를 입력하세요 :");
				psw = sc.next();
				System.out.print("이름을 입력하세요 :");
				name = sc.next();
				System.out.print("이메일을 입력하세요 :");
				email = sc.next();
				customerArr[i] = new Customer(name, id, pws, email);	
				
				System.out.println(CustomerArr[i].toString());
				System.out.println("회원정보가 정상적으로 등록되었습니다.");
				break;
			} else if (i == customerArr.length - 1) {
				System.out.print("더 이상 회원을 등록할수 없습니다.");
			}
		}
		
		
		
		
	
		
		// ++-------------------- 로그인 -------------------------++
//		Customer loginCustomer;
//		
//		String id, psw;
//		
//		System.out.print("아이디 :");
//		id = sc.next();
//		
//		System.out.print("비밀번호 :");
//		psw = sc.next();
//		
//		for (int i = 0; i <customerArr.length; i++) {
//			if(customerArr[i] == null) {
//				System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//				break;		
//		}	else if (customerArr[i].equals(id, psw)) {
//			loginCustomer = customerArr[i];
//			System.out.print("로그인 성공");
//			break;
//		}  else if (customerArr[i].idCheck(id)) {
//			System.out.println("비밀번호가 틀렸습니다.");
//			break;
//		}  else if ( i== customerArr.length - 1) {
//			System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//		}
//		}
		
		
	}	
}
