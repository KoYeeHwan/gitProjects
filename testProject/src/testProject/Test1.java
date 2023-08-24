package testProject;
import java.util.*;
//1. 변수가 몇개 필요한지 체크
//2. 내가 할 수 있는 출력 해보고
//3. 입력 받아야할 곳에 입력 넣고
//4. 입력받은 값을 활용해서 출력
public class Test1 {
	public static void main(String[] args) {
		String name, gender;
		int age;
		float height;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요:");
		name = sc.nextLine();
		System.out.print("성별을 입력하세요(남/여):");
		gender = sc.nextLine();
		System.out.print("나이를 입력하세요:");
		age = sc.nextInt();
		System.out.print("키를 입력하세요(cm):");
		height = sc.nextFloat();
		System.out.print("키 "+height+" cm인 "+age+"살 "+gender+"자 "+name+"님 반갑습니다 ^^");
		
	}
}
