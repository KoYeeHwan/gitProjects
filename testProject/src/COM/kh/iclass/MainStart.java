package COM.kh.iclass;
import java.util.Scanner;

public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CafePos pos = CafePos.getInstance();
		//메뉴 생성, 삭제, 수정, 조회, 전체출력
		
		while(pos.getIsRun()) {
			int number = pos.printMenu();
			switch(number) {
				case 1:{ // 생성
					pos.insertMenu();
				}break;
				case 2:{//수정
					pos.updateDrinkUnit();
				}break;
				case 3:{//조회
					pos.searchDrinkUnit();
				}break;
				case 4:{//삭제
					pos.deleteDrinkUnit();
				}break;
				case 5:{//전체메뉴확인
					pos.printDrinkArr();
				}break;
				default:
					pos.setIsRun(false);
			}
		}	
		
//		final int MAX =20;
//		Product[] menuArr = new Product[MAX];
		
		//아이스아메리카노, 카페라떼, 핫초코
		//클레스이름 객체이름 = new 클레스이름(매개변수);
		
		// 음료명, 금액, 설명을 입력받아 menuArr에 추가해 보아라
		// 음료명을 입력하세요 :
		// 금액을 입력하세요 :
		// 설명을 입력하세요 :
		// ooo가 메뉴에 추가되었습니다.
		// 또는 ooo은 이미 등록되어있습니다.
		
//		String name, description;
//		int price;
//		
//		System.out.println("음료명을 입력하세요:");
//		name = sc.next();
//		System.out.println("금액을 입력하세요:");
//		price = sc.nextInt();
//		System.out.println("설명을 입력하세요:");
//		description = sc.next();
//		
//		menuArr[0] = new Product(name, price, description);
//	
//		for (int i = 0; i < menuArr.length; i++) {
//			 if (menuArr[i] == null) { // 객체에 자리가 비어있니?
//				menuArr[i] = new Product(name, price, description);
//				System.out.print(menuArr[i].getName() + "메뉴가 추가 되었습니다.");
//				break;
//			 }else if(menuArr[i].getName().equals(name)) { // 객체에 이름데이터의 값이 입력받은 이름과 똑같니?
//				System.out.println(name + "는(은) 이미 등록되어 있습니다.");		
//				break;
//			} else if (i == (menuArr.length - 1)) { // 마지막까지 확인이 끝났니?
//				System.out.print("더 이상 메뉴를 추가 할 수 없습니다.");				
//			}
//		}
//		
//		// 음료목록 출력해주세요.
//		// 메뉴명 가격 설명
//		System.out.println("메뉴명\t가격\t설명");
//		for (int i = 0; i < menuArr.length; i++) {	
//			if(menuArr[i] == null) {
//				System.out.println(i + "\t-\t-\t-");
//			} else
//			System.out.println(i + "\t" + menuArr[i].toString());
//		}
//		
//		//가장 최신으로 저장된 목록 1개 삭제
//		for(int i = (menuArr.length - 1); i >= 0; i--) {
//			if(menuArr[i] !=null) {
//				System.out.println(menuArr[i].getName() + "가 메뉴가 삭제되었습니다.");
//				menuArr[i] = null;
//				break;
//			} else if (i == 0) {
//				System.out.println("삭제할 메뉴가 존재하지 않습니다.");
//			}
//		}                
		
		//조회
		// 조회 할 메뉴의 이름을 입력하세요 : 아메리카노
		// 0 아메리카노 1000 시원해요
		// 해당 메뉴가 목록에 존재하지 않습니다.
//		System.out.print("조회할 메뉴의 이름을 입력하세요 :");
//		String tName = sc.next();
//		for(int i = 0; i < menuArr.length; i++) {			
//			if(menuArr[i] == null) {				
//				System.out.print("해당메뉴가 목록에 존재하지 않습니다.");
//				break;
//			} else if(menuArr[i].getName().equals(tName)) {
//				System.out.println(i + "\t" + menuArr[i].toString());
//				break;
//			} else if ( i == (menuArr.length - 1)) {
//				System.out.println("해당메뉴가 목록에 존재하지 않습니다.");
//			}
//		}		
		
		// 수정 할 메뉴의 번호를 입력하세요 : (번호)
		// 수정 할 정보를 입력하세요 : (이름, 가격, 설명)
		// 새로운 oo을 입력하세요 : 
		// selectMenu 이용해서 해당정보 수정 후 아래와 같이 출력
		// (번호) 아메리카노 1000 시원해요
		
//		Product selectMenu;
//		int num;
//		System.out.print("수정 할 메뉴의 번호를 입력하세요 : ");
//		num = sc.nextInt();
//		selectMenu = menuArr[num];
//		if (selectMenu == null) {
//			System.out.println("해당 번호의 메뉴가 존재하지 않습니다.");
//		} else {
//			System.out.print("수정할 정보를 입력하세요 :");
//			switch(sc.next()) {
//				case "이름" :
//					sc.nextLine();
//					System.out.print("새로운 이름을 입력하세요 :");
//					selectMenu.setName(sc.nextLine());
//					break;
//				case "가격" :
//					System.out.print("새로운가격을 입력하세요 :");
//					selectMenu.setPrice(sc.nextInt());
//					break;
//				case "설명" :
//					sc.nextLine();
//					System.out.print("새로운 설명을 입력하세요 :");
//					selectMenu.setDescription(sc.nextLine());
//					System.out.println(num + "\t" + selectMenu.toString());
//					break;
//				default :
//					System.out.print("잘못 입력 하셨습니다.");
//			}
//		}
//	}	
//}		
		
		/////////////////////////////////
		//class사용해서 객체배열 만드는 방법
		// class이름 [] 객체배열이름 = new class[크기(길이)];
		// -> 위치럼 작성시 객체배열이 생성은 되지만 비어있는 상태;
//		Product[] drinkList = new Product[2];
//		//실제 객체를 만드는 방법
//		// 2) 객체배열이름[index] = new class 이름(매개변수);
//		drinkList[0] = new Product("아메리카노", 1000, 10);
//		drinkList[1] = new Product("카페라떼", 2000, 10);
//		
//		drinkList[0].productInfo();
//		drinkList[1].productInfo(); 
				
		
		//class이름 객체이름 = new 클레스이름(	);
//		Product iceAme; //참조변수만 만들어진 상태(리모콘만 들고있는 상태)
//		iceAme = new Product("아메리카노", 1000, 10); //참조변수가 메모리공간의 주소값을 가지고 잇는 상태 (리모콘을 제품에 연결한 상태
//				
//		Product iceLatte; //참조변수만 만들어진 상태(리모콘만 들고있는 상태)
//		iceLatte = new Product("카페라떼", 2000, 10); //참조변수가 메모리공간의 주소값을 가지고 잇는 상태 (리모콘을 제품에 연결한 상태
//				
//		iceAme.productInfo();
//		iceLatte.productInfo();
		
		
//		System.out.print(iceAme.addPrice(iceLatte.getPrice()));
		

		
	}
}

