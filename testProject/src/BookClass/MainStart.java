package BookClass;

import java.util.Scanner;

public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//도서를 등록, 삭제, 전체 도서목록 조회, 검색하는 기능을 구현해 보아라
		Book[] BookList = new Book[3];
		BookList[0] = new Book("이름", "장르", "번호");
		
		String name, genre;
		int num;
		System.out.println("1. 이름을 입력하세요 :");
		name = sc.next();
		System.out.println("2. 장르를 입력하세요 :");
		genre = sc.next();
		System.out.println("3. 번호를 입력하세요 :");
		num = sc.nextInt();
		
		
	
	}
}
