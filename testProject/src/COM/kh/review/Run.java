package COM.kh.review;

import java.util.*;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Human jiwon = new Human("choi", 21, "201111-xxxxxxx", 'm');
		Book[] jiwonBookList = jiwon.getBookList();
		jiwonBookList[0] = new Book("꿈꾸는 다락방");
		String jiwonName = jiwon.getName();
		
		
/////////////////////////////////////////////////////////////////////		
//		Human[] arr = new Human[10];
//		List<Human> list = new ArrayList<>();
//		
//		
//		arr[0] = new Human("choi", 21, "201111-xxxxxxx", 'm');
//		arr[1] = new Human("kim", 23, "201111-xxxxxxx", 'm');
//		arr[2] = new Human("jin", 25, "201111-xxxxxxx", 'm');
//		
//		arr[1] = null;
//		arr[1] = arr[2];
//		arr[2] = null;
//		
//		System.out.println(arr[1].getAge());
//		
//		list.add(new Human("choi", 21, "201111-xxxxxxx", 'm'));
//		list.add(new Human("kim", 23, "201111-xxxxxxx", 'm'));
//		list.add(new Human("jin", 25, "201111-xxxxxxx", 'm'));
//		
//		list.remove(1);
//		
//		System.out.println(list.get(1));

//////////////////////////////////////////////////////////////////
		
//		Kim.setAge(12);
//		System.out.println(Kim.getFutureAge());
		
		// Human 클래스 내부에 나이에 + 10을 더해서
		// "제 10년후 나이는 oo살입니다." 의 스트링값을 반환하는
		// 메서드를 만들어 주세요.
		
		// 크기가 3인 Human형 객체 배열 arr을 만들고
		// kim과 choi와 똑같은 데이터로 0번, 1번째 인덱스에 생성해라
/////////////////////////////////////////////////////////////////////
		
//		Human Kim = new Human("김소망", 15, "201211-2xxxxxx", 'f');
//		Human choi = new Human("최지원", 45, "901211-2xxxxx", 'f');
//		
//		int[] arr2 = new int[3];
//		Human[] arr = new Human[3];
//		arr[0] = Kim;
//		arr[1] = new Human("최지원", 45, "901211-2xxxxx", 'f');
//		
//		Kim.setName("김씨아님");
//		
//		arr[0].setName("사실내가Kim");
//		
//		System.out.println(Kim.toString());
//		System.out.println(arr[0].toString());
//		System.out.println(arr[1].toString());
	}
}
