package COM.kh.extend;
import java.util.Scanner;

public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//클레스이름[] 객체배열이름 = new 클레스이름[크기];
		Human[] humanList = new Human[10];
		humanList[0] = new Human("최지원", "남자", 20, 100.0f);
		
		//humanList[1] 입력받아서 생성해라
		// 이름을 입력하세요 :
		// 성별을 입력하세요 :
		// 나이를 입력하세요 :
		// 몸무게를 입력하세요 :
		
		String name, gender;
		int age;
		float weight;
		System.out.println("이름을 입력하세요 :");
		name = sc.next();
		
		System.out.println("성별을 입력하세요 :");
		gender = sc.next();
		
		System.out.println("나이를 입력하세요 :");
		age = sc.nextInt();
		
		System.out.println("몸무게를 입력하세요 :");
		weight = sc.nextFloat();
		
		humanList[1] = new Human(name, gender, age, weight);
		
		System.out.println("이름\t성별\t나이\t몸무게");
		
		for (int i = 0; i <humanList.length; i++) {
			if(humanList[1] == null) {
				break;
			}	
			System.out.println(humanList[i].toString());
		}
		
		//맨뒤에 있는(가장 마지막으로 넣은) 객체 삭제
//		for(int i = 0; i < humanList.length; i ++) {
//			if(humanList[0] == null) {
//				System.out.print("삭제할 데이터가 없습니다.");
//				break;
//			}else if (humanList[i] == null) {
//				humanList[i - 1] = null;
//				break;
//			}
//		}
		
		for(int i = (humanList.length - 1); i >= 0; i--) {
			if (humanList[i] != null) {
				humanList[i] = null;
				break;
			}
		}
		
	}
}
