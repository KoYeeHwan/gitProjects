package COM.kh.javai;

import java.util.Scanner;

// main메서드를 실행해주기위한 class

public class MainStartt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 인스턴스 객체생성 방법
		// 클레스이름 객체이름 = new 생성자(클레스와 이름이 동일한 메서드);
//		Student choi = new Student("최지원 ", 48, "여자");
//		Student kim = new Student("김라라 ", 12, "남자");
//		//아래 두 코드를 실행되면 각기 다른 결과값이 나타난다
//		//이를 통해 각기 다른 메모리 공간을 확보하고 사용한다는 것을 알 수 있다.
//		choi.info();
//		kim.info();
		
		
//		영어점수 수학점수 국어점수를 입력받아
//		각과목이 40점이상이고 평균이 60점 이상일 때 합격
//		조건을 충족하지 못하면 불합격을 나타내주는 프로그램 작성
//		ex) 영어점수 : 40
//			국어점수 : 70
//  	 	수학점수 : 70
//			총합 : 180
//			평균 : 60.0
//			합격입니다.
		
		
//		Student choi = new Student("최지원 ", 24, "남자");
//		
//		int en, ko, math;		
//		System.out.print("영어점수 :");
//		choi.setEnScore(sc.nextInt());
//		
//		System.out.print("국어점수 :");
//		choi.setKoScore(sc.nextInt());
//		
//		System.out.print("수학점수 :");
//		choi.setMathScore(sc.nextInt());
//		
//		choi.displayMyInfo();
//		
//		System.out.print("총합 :" + choi.getTotal());
//		System.out.print("평균 :" + choi.getAvg());
//		
//		System.out.print("영어점수 :" + choi.getEnScore());
//		System.out.print("국어점수 :" + choi.getKoScore());
//		System.out.print("수학점수 :" + choi.getMathScore());
//		
//		choi.checkPass();
		
//--------------------------------------------------------------------------		
		
		
//		Car(String color, String company, String type, String engine, String date, int maxSpeed, int zero100, int maxCc)
//		Car jiwonCar = new Car ("흰색", "bmw" , "중형", "가솔린", "2023-08-04", 150, 5, 100);
//		jiwonCar.statusDisplay();
		
		// 행동을 입력받고 진행하는 프로그램을 작성하세요.
		// 1. 달린다.
		// 2. 멈춘다.
		// 3. 기름을 충전한다.
		// 4. 속도와 잔여 기름 양을 확인한다.
		// 다른 버튼을 누르면 종료
//		boolean isFinish = false;
//		while(true) {
//			int num;
//			System.out.println("원하는 행동의 버튼을 클릭하세요.");
//			System.out.println("----------");
//			System.out.println("1. 달린다.");
//			System.out.println("2. 멈춘다.");
//			System.out.println("3. 기름을 충전한다.");
//			System.out.println("4. 속도와 잔여 기름 양을 확인한다.");
//			System.out.println("다른 버튼을 누르면 종료");
//			System.out.println("----------");
//			
//			num = sc.nextInt();
//			switch(num) {
//				case 1:
//					jiwonCar.onaxel();
//					jiwonCar.statusDisplay(2);
//					break;
//				case 2:
//					jiwonCar.onbreak();
//					jiwonCar.statusDisplay(2);
//					break;	
//				case 3:
//					System.out.println("얼마나 충전하시겠습니까?");
//					int cc = sc.nextInt();
//					jiwonCar.inserc(cc);
//					break;
//				case 4:
//					jiwonCar.statusDisplay(2);
//				default:
//					isFinish = true;
//			}	
//		}
		
		//package com.kh.javai;

		Student choi = new Student("소망", 26, "남자");
		Student kim = new Student("사랑", 23, "여자");
		Student yoon = new Student("희망", 24, "남자");
		Student.showCount();

		
	}
}
