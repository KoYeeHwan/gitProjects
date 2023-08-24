package KH.OOP3;

import java.util.*;

public class ArrayList<E> {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>(); // 컬렉션 인스턴스 생성

		// 컬렉션 인스턴스에 문자열 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		// 저장 된 문자열 인스턴스의 참조
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();

		list.remove(0); // 첫번째 인스턴스 삭제

		// 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
	}
}
