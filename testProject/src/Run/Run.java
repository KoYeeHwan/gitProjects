package Run;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Snack[] SnackMenu = new Snack[5];
		SnackMenu[0] = new Snack("빵", "케이크", "블루베리", 1, 15000);
		
		String kind, name, flavor;
		int numOf, price;
		
		System.out.println("종류를 입력하세요 :");
		kind = sc.next();
		System.out.println("이름을 입력하세요 :");
		name = sc.next();
		System.out.println("맛을 입력하세요 :");
		flavor = sc.next();
		System.out.println("개수를 입력하세요 :");
		numOf = sc.nextInt();
		System.out.println("가격을 입력하세요 :");
		price = sc.nextInt();
		
		SnackMenu[1] = new Snack(kind, name, flavor, numOf, price);
		
		System.out.println("종류\t이름\t맛\t개수\t가격");
		
		
	}
}
