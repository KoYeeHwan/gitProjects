package testProject;

import java.util.Scanner;

public class Test41 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str, res = null; 
		String[] arr = {"양념", "간장", "갈릭", "후라이드"};
		// "양념" "간장" "갈릭" "후라이드:로 구성된 배열 하나 생성 이름은 arr
		
		System.out.print("치킨 이름을 입력하세요 : ");
		str = sc.next();
		
		// 배열의 0번째부터 끝까지 하나씩 비교해보여야한다.
		for (int i = 0; i < arr.length; i++) {
			if (str.equals(arr[i])) {
				res = str + " 치킨 배달 가능";
				break;
			}else {
				res = str + " 치킨은 없는 메뉴입니다.";
			}		
		}		
		
		System.out.print(res);
		
		
		
	}
}
